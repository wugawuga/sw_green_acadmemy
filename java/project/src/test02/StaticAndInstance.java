package test02;

public class StaticAndInstance {
	
	// 정적(클래스) 멤버
	static int field1; // 클래스 필드
	static void method1() { // 클래스 메서드
		System.out.println("클래스 메서드");
	}
	
	// 인스턴스 멤버
	int field2;
	void method2() {
		System.out.println("인스턴스 메서드");
	}
	
	// -------------------------------------------------------
	// 정적 메서드에서의 호출
	static void method3() {
		System.out.println("클래스 메서드 호출");
		// 위에 만들어진 멤버 4개 호출
		// 클래스 멤버를 호출하는 데 아무런 문제 없다.
		field1 = 10;
		method1();

		
		// method3() 이 실행되야 할 시점에 인스턴스 멤버는 존재하지 않는다!!
//		field2 =20;
//		method2();
//		this.field2 = 20;
//		this.method2();
	}
	
	// 인스턴스 메서드에서의 호출
	void method4() {
		System.out.println("인스턴스 메서드 호출");
		
		
		// 정적 멤버 호출 가능
		field1 = 10;
		method1();
		
		// 인스턴스 멤버 호출 가능
		field2 = 20;
		method2();
		this.field2 = 20;
		this.method2();
	}
}
