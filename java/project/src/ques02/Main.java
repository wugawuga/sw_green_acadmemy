package ques02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Student stt = new Student();
		while(true) {
			
			ArrayList<Student> list = new ArrayList<>();
			
			System.out.println("성적 관리 입니다.");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 확인");
			System.out.println("3. 석차 확인");
			System.out.println("4. 종료");
			System.out.print(">> ");
			int slt = scan.nextInt();
			switch(slt) {
			case 1:
				Student stt = new Student();
				System.out.print("이름을 입력하세요 : ");
				stt.setName(scan.nextLine());
				stt.setScores(Integer.parseInt(scan.nextLine()));
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("다시 입력해 주세요.");
			}
		}
	}

}
