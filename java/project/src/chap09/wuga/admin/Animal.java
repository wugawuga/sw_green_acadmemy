package chap09.wuga.admin;

public class Animal {
	
	public String field1 = "public";
	String field2 = "default";
	private String field3 = "private";
	protected String field4 = "protected";
	
	public void method1() {
		System.out.println("public");
	}
	void method2() {
		System.out.println("default");
	}
	private void method3() {
		System.out.println("private");
	}
	protected void method4() {
		System.out.println("protected");
	}
}
