package test02;

public class Test02 {

	public static void main(String[] args) {

		info("홍길동");
		info("홍길동","의적");
		info("홍길동",25);
		info(40,"홍길동");

	}
	private static void info(int num, String name) {
		System.out.println("시험번호 : "+num);
		System.out.println("이름 : "+name);
	}
	private static void info(String name, int age) {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	private static void info(String name, String job) {
		System.out.println("이름 : "+name);
		System.out.println("직업 : "+job);
	}
	private static void info(String name) {
		System.out.println("이름 : "+name);
	}

}
