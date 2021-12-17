package chap03;

public class Single {
	// 싱글턴 패턴 : 자바 클래스간의 연결을 설명하는 디자인 패턴 중에
	//			  프로그램 내 단 하나의 인스턴스만 만들어 사용하도록
	//		 	  유도하는 패턴!!!
	
	// 1단계 : 생성자에 private를 붙여서 인스턴스를 못 만들게 한다.
	private Single() {}
	
	// 2단계 : static 영역에 인스턴스 생성
	private static Single s = new Single();
	
	// 3단계 : 생성된 인스턴스를 꺼내서 사용할 수 있는 메서드 준비 : getInstance
	public static Single getInstance() {
		return s;
	}
	
	// ------------------------------------------------------------
	// 싱글턴 인스턴스를 사용하기 위한 멤버를 준비해서 사용한다.
	
}
