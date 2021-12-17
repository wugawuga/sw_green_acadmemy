package chap02.green.admin;

public class Member {
	
	public String field1 = "public";
	String field2 = "default";
	private String field3 = "private";
	
	public void method1() {
		System.out.println("public");
	}
	void method2() {
		System.out.println("default");
	}
	private void method3() {
		System.out.println("private");
	}
	
	public void check() { // 같은 인스턴스 멤버끼리는 모든 제한자 호출 가능
		System.out.println("public field1 : "+this.field1);
		System.out.println("default field2 : "+this.field2);
		System.out.println("private field3 : "+this.field3);
		
		this.method1();
		this.method2();
		this.method3();
	}
}
