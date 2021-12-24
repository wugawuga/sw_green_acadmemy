package chap09.wuga.main;

public class Main02 {

	public static void main(String[] args) {
		
		// 같은 패키지의 인스턴스 내 멤버 호출 private만 제외하고 멤버 호출 가능
		
		Member m1 = new Member();
		
		System.out.println("public field1 : "+m1.field1);
		System.out.println("default field2 : "+m1.field2);
		System.out.println("private field3 : "+m1.field3);
		
		m1.method1();
		m1.method2();
		m1.method3();
		
		//-----------------------------------------
			// 다른 패키지의 인스턴스 내 멤버 호출 public만 멤버 호출 가능
		chap09.wuga.admin.Member m2 = new chap09.wuga.admin.Member();
		
		System.out.println("public field1 : "+m2.field1);
		System.out.println("default field2 : "+m2.field2);
		System.out.println("private field3 : "+m2.field3);
		
		m2.method1();
		m2.method2();
		m2.method3();
	}

}
