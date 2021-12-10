package project;

public class Main04 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		//s1.userName = "홍길동";
		s1.setUserName("홍길동");
		s1.setJavaScore(1000);
		s1.setOracleScore(-2000);
		
		System.out.println(s1.getUserName()+"의 합계점수 : "+(s1.getJavaScore()+s1.getOracleScore()));
	}

}
