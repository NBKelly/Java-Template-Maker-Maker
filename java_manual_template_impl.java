//this is mainly presented as an example of a manual method,
//and also used as a stepping-stone document for making the next layer of abstraction (template_maker)
public class java_manual_template_impl extends java_template{

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
