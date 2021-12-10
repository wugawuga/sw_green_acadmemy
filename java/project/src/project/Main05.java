package project;

public class Main05 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setUserName("고길동");
		
		Student s2 = new Student();
		s2.setUserName("홍길동");
		
		s1.className = "소드마스터";
		System.out.println(s1.getUserName()+"의 소속 클래스 : "+s1.className);
		
		System.out.println(s2.getUserName()+"의 소속 클래스 : "+s2.className);
		System.out.println("********************************");
		
		s2.className = "활빈당";
		System.out.println(s1.getUserName()+"의 소속 클래스 : "+s1.className);
		
		System.out.println(s2.getUserName()+"의 소속 클래스 : "+s2.className);
		System.out.println("********************************");
		
		// 정적 필드(static)
		Student.className = "의적패";
		System.out.println(s1.getUserName()+"의 소속 클래스 : "+s1.className);
		
		System.out.println(s2.getUserName()+"의 소속 클래스 : "+s2.className);
	}

}
