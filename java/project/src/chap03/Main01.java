package chap03;

public class Main01 {

	public static void main(String[] args) {
		
		// Single s = new Single(); 생성자가 private => 인스턴스 생성 불가
		
		Single s1 = Single.getInstance();
		
		Single s2 = Single.getInstance();
		
		// s1이나 s2나 같은 인스턴스
		if(s1==s2) {
			System.out.println("s1과 s2는 같은 인스턴스");
		}else {
			System.out.println("s1과 s2는 다른 인스턴스");
		}
		
		// 싱글턴이 아닌 경우
		Member m1 = new Member();
		Member m2 = new Member();
		
		if(m1==m2) {
			System.out.println("m1과 m2는 같은 인스턴스");
		}else {
			System.out.println("m1과 m2는 다른 인스턴스");
		}
	}

}
