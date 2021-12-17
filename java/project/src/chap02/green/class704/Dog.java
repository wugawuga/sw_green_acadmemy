package chap02.green.class704;

import chap02.green.admin.Animal;

public class Dog extends Animal{
	
	
	public void check() {// 부모 클래스가 가진 자식 클래스가 사용 가능한가??
		
		// 부모클래스와 자식클래스간에 패키지가 다르므로 default 사용불가
		// 상속관계로 묶여있으므로 protected는 사용가능!!
		
		System.out.println("public field1 : "+super.field1);
		System.out.println("default field2 : "+super.field2);
		System.out.println("private field3 : "+super.field3);
		System.out.println("protected field4 : "+super.field4);
		
		super.method1();
		super.method2();
		super.method3();
		super.method4();
	}
}
