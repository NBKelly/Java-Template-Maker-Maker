import java.util.ArrayList;

public abstract class java_template {
    ArrayList<String> types = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> access = new ArrayList<>();
    ArrayList<String> comments = new ArrayList<>();
    
    private final char lineBreak = '\n';
    private final char space = ' ';
    private final String spacer = "   ";

    private final String fileHeader = "//Automaticaly generated class based on java_template by nbk.";
    
    protected StringBuilder output = new StringBuilder();
    
    protected void addProperty(String access, String type, String name) {
	addProperty(access, type, name, null);
    }

    protected void addProperty(String access, String type, String name, String comment) {
	this.access.add(access);
	this.types.add(type);
	this.names.add(name);
	this.comments.add(comment);
    }
    
    abstract String className();

    abstract String classAccess();

    protected void makeClass() {
	//step one: header
	appendLn(fileHeader);
	append(classAccess());
	append("class");
	append(className());
	appendLn("{");

	//step two: parameters
	for(int index = 0; index < names.size() - 1; index++) {
	    if(comments.get(index) != null) {
		append("  ");
		appendLn(comments.get(index));
	    }
	    
	    append(spacer);
	    append(access.get(index));
	    append(types.get(index));
	    appendLn(names.get(index) + ";");
	    appendLn("");
	}

	//step three: initializer
	appendLn("    ");

	append(spacer);
	append("public");
	append(className());
	append("(");

	for(int index = 0; index < names.size() - 1; index++) {
	    append(types.get(index));
	    append(names.get(index) + ((index == names.size() - 2 ) ? "" : ","));
	}

	appendLn(") {");

	//initializer body
	//format of each line: this.(name) = (name);
	for(String name : names) {
	    append(spacer);
	    append(spacer);
	    appendLn(assign(name));
	    if(name.equals(names.get(names.size() - 1)))
	       continue;
	    //	    append("this." + name);
	    //append("=");
	    //appendLn(name + ";");
	}

	//initializer close
	append(spacer);
	appendLn("}");

	appendLn("\n    //getters and setters");
	
	//getters and setters
	for(int index = 0; index < names.size(); index++) {
	    String name = names.get(index);
	    String type = types.get(index);
	    String convertedName = Character.toUpperCase(name.charAt(0)) + name.substring(1);

	    //getter
	    append(spacer);
	    append("public");
	    append(type);
	    append("get" + convertedName + "() {");
	    append("return " +name + ";");
	    appendLn("}");

	    //setter
	    append(spacer);
	    append("public void");
	    append("set" + convertedName + "(");
	    append(type);
	    append(name);
	    append(") {");
	    append(assign(name));
	    appendLn("}");

	    appendLn("");
	}
	
	appendLn("");
	appendLn("    //specified inserted values");
	InsertValues();
	appendLn("");
	
	//close body
	appendLn("}");
    }

    abstract void InsertValues();
    
    protected void print() {
	System.out.println(output);
    }
    
    protected void append(String str) {
	output.append(str);
	output.append(space);
    }

    protected void appendLn(String str) {
	output.append(str);
	output.append(lineBreak);
    }

    protected String assign(String value) {
	return  "this." + value + " = " + value + ";";
    }

    protected String appendType(String value, String type) {
	switch(type) {
	case "boolean":
	    if(value.matches("((Y|y)es)|((T|t)rue)"))
		return "true";
	    else if (value.matches("((N|n)o)|((F|f)alse)"))
		return "false";
	    else throw new IllegalArgumentException("value '" + value + "'of type boolean does not match boolean patterns");
	case "String":
	    value = value.replaceAll("\"", "");
	    value = "\"" + value + "\"";
	    return value;
	default:
	    return value;
	}
    }
}
