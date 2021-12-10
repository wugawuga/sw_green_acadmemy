package project;

import java.util.Scanner;

public class Main03 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Student student = scoreInput();
		System.out.println("학생이름 : "+ student.getUserName());
		System.out.println("자바점수 : "+ student.getJavaScore());
		System.out.println("오라클점수 : "+ student.getOracleScore());
	}
	
	private static Student scoreInput() {
		System.out.println("성적을 입력합니다.");
		System.out.println("학생 이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("자바 점수를 입력하세요.");
		int java = Integer.parseInt(scan.nextLine());
		System.out.println("오라클 점수를 입력하세요.");
		int oracle = Integer.parseInt(scan.nextLine());
		
		Student s = new Student();
		s.setUserName(name);
		s.setJavaScore(java);
		s.setOracleScore(oracle);
		
		return s;
		
	}

}