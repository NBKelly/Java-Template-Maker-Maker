import java.util.Scanner;
import java.util.ArrayList;

public class java_template_generator {
    static ArrayList<String> varAccesses = new ArrayList<>();
    static ArrayList<String> varTypes = new ArrayList<>();
    static ArrayList<String> varNames = new ArrayList<>();
    static ArrayList<String> varComments = new ArrayList<>();
    //Potential file format:
    //Name
    //Access
    //var access type name
    //var access type name
    //...
    //var access type name
    //InsertValues  '_delimiter_'
    //Indices       0, 1, 5, 3, ... 8
    //StartLine     n

    //from this we should be able to do the following:
    //set a name for the new data type
    //set access for the type itself
    //allow for the creation of arvitrarily many values, and have an entire data type defined based on that
    //generate template functions to allow for insertion of values based on data file of csv format
    public static void main(String[] argv) {
	Scanner sc = new Scanner(System.in); //start reading the file

	//get the name
	String typeName = sc.next();
	sc.nextLine();

	String typeAccess = sc.next();
	sc.nextLine();

	ArrayList<String> indices = new ArrayList<>();
	String scVal = "";
	while((scVal = sc.next()).equals("var")) {
	    varAccesses.add(sc.next());
	    varTypes.add(sc.next());
	    String str = sc.next();

	    if(str.equals("data")) {
		System.err.println("Err: data is a reserved variable name :DDD");
		System.exit(0);
	    }
	    
	    varNames.add(str);
	    String comment = sc.nextLine();
	    varComments.add(comment);
	}

	varAccesses.add("private");
	varTypes.add(typeName + "[]");
	varNames.add("data");
	varComments.add("The generated data pulled from the accompanying file.");
	
	String delim = sc.nextLine();
	int start = delim.indexOf("'_");
	delim = delim.substring(start + 2);

	int end = delim.indexOf("_'");
	delim = delim.substring(0, end);

	//get the indices
	sc.next();

	String indexStr = "";
	while(!(indexStr = sc.next()).equals("StartLine")) {
	    indices.add(indexStr);
	}

	String startLine = sc.next();

	if(indices.size() != varTypes.size() - 1) {
	    System.err.println("ind: " + indices.size());
	    System.err.println("var: " + varTypes.size());
	    System.err.println("Error: number of arguments does not match number of indices");
	    return;
	}

	
	createTemplate(typeName, typeAccess, delim, startLine, indices);

	System.out.println(builder);
    }

    static StringBuilder builder = new StringBuilder();
    
    private static void createTemplate(String className, String classAccess, String delimiter, String startLine, ArrayList<String> indices) {
	String proper_classname = className + "_template";

	//create header and the inherited property access functions
	appendl("import java.util.Scanner;");
	appends("public");
	appends("class");
	appends(proper_classname);
	appendl("extends java_template {");
	appendl("    @Override protected String className() { return \"" + className + "\"; }");
	appendl("    @Override protected String classAccess() { return \"" + classAccess + "\"; }");
	appendl();
	
	//create the main method
	appendl("    public static void main(String[] argv) {");
	append("        ");
	appends(proper_classname);
	appendl("val = new " + proper_classname + "();");

	for(int index = 0; index < varAccesses.size(); index++) {
	    append("        val.addProperty(\"");
	    append(varAccesses.get(index) + "\", \"" + varTypes.get(index) + "\", \"");
	    if(varComments.get(index).length() > 4)
		appendl(varNames.get(index) + "\", \"" + varComments.get(index) + "\");");
	    else
		appendl(varNames.get(index) + "\");");
	}
	
	appendl("        val.makeClass();");
	appendl("        val.print();");
	appendl("    }");
	appendl();

	//create the insertvalues function
	appendl("    @Override void InsertValues(){");
	appendl("        Scanner sc = new Scanner(System.in);");
	appendl("        for(int i = 1; i < " + startLine + "; i++) { sc.nextLine(); } //skip any headers as defined in conf");

	append( "        appendLn(");
	appendq("    " + className + "[] data = {");
	appendl(");");

	appendl("        while(sc.hasNextLine()) {");
	appendl("            String[] s = sc.nextLine().split(\"" + delimiter + "\");");
	appendl();
	appendl( "            append(\"        new " + className + "(\");");		
	for(int i = 0; i < indices.size();i++) {
	    appendl("            append(appendType(s[" + indices.get(i) + "], \"" + varTypes.get(i) + "\"));"); 
	    if(i != indices.size() - 1)
		appendl("            append(\", \");");
	    else
		appendl("            append(\")\");");
	}
	appendl("            if (sc.hasNextLine()) ");
	appendl("                appendLn(\",\");");
	appendl("            else appendLn(\"\");");
	appendl("        };");
	appendl("        appendLn(\"    };\");");
	appendl("        sc.close();");
	appendl("    }");
	//end
	appendl("}");
    }

    private static void append (String str) { builder.append(str);        }
    private static void appends(String str) { builder.append(str + " ");  }
    private static void appendl(String str) { builder.append(str + "\n"); }
    private static void appendl(          ) { builder.append(      "\n"); }
    private static void appendq(String str) { builder.append("\"" + str + "\""); }
}
