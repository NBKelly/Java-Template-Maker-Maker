import java.util.Scanner;
import java.util.ArrayList;

public class java_template_generator {
    static ArrayList<String> varAccesses = new ArrayList<>();
    static ArrayList<String> varTypes = new ArrayList<>();
    static ArrayList<String> varNames = new ArrayList<>();

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
	    varNames.add(sc.next());
	    sc.nextLine();
	}

	String delim = sc.nextLine();
	int start = delim.indexOf("'_");
	delim = delim.substring(start + 2);

	int end = delim.indexOf("_'");
	delim = delim.substring(0, end);

	//get the indices
	sc.next();

	while(!sc.next().equals("StartLine")) {
	    indices.add(sc.next());
	}

	String startLine = sc.next();

	createTemplate(typeName, typeAccess);

	System.out.println(builder);
    }

    static StringBuilder builder = new StringBuilder();
    
    private static void createTemplate(String className, String classAccess) {
	String proper_classname = className + "_template";

	//create header and the inherited property access functions
	appends("public");
	appends("class");
	appends(proper_classname);
	appendl("extends java_template {");
	appendl("    @Override protected String className() { return \"" + className + "\"; }");
	appendl("    @Override protected String classAccess() { return \"" + classAccess + "\"; }");

	//create the main method
	appendl("    public static void main(String[] argv) {");
	append("        ");
	appends(proper_classname);
	appendl("val = new " + proper_classname + "();");

	for(int index = 0; index < varAccesses.size(); index++) {
	    append("        val.addProperty(\"");
	    append(varAccesses.get(index) + "\", \"" + varTypes.get(index) + "\", \"");
	    appendl(varNames.get(index) + "\");");
	}
	
	appendl("        val.makeClass();");
	appendl("        val.print();");
	appendl("    }");
	//create the insertvalues function

	appendl("    @Override void InsertValues(){ }");
	//end
	appendl("}");
    }

    private static void append(String str) { builder.append(str); }
    private static void appends(String str) { builder.append(str + " "); }
    private static void appendl(String str) { builder.append(str + "\n"); }
}


/*
  public class java_template_impl extends java_template{

    private String out_name = "test";
    private String out_access = "public";

    @Override protected String className() { return out_name; }
    @Override protected String classAccess() { return out_access; }

    //purpose of InsertValues: insert values based on the content of some file
    //this is to be implemented by a user
    @Override protected void InsertValues() {}

    public static void main(String[] argv) {
	java_template_impl impl = new java_template_impl();
	impl.addProperty("public", "String", "res");
	impl.addProperty("public", "String", "res2");
	impl.makeClass();
	impl.print();
    }
  }
*/
