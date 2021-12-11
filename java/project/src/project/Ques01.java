package project;

import java.util.Scanner;

public class Ques01 {
	
	static Scanner scan = new Scanner(System.in);
	
	static String[] names = {"", "", "", "", ""}; // 학생이름 저장공간
	static int[][] scores = new int[5][3]; // 학생성적 저장공간
	static String[] subjects = new String[] {"영어","국어","수학"};
	static double[]	average = new double[5];// 학생평균 저장공간
	static int[] grade = new int[] {1,1,1,1,1}; // 학생석차 저장공간
	
	public static void main(String[] args) {
		
		boolean execute = true;
		while(execute) {
			System.out.println("성적 관리 프로그램입니다.");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적조회");
			System.out.println("3. 석차조회");
			System.out.println("4. 종료");
			System.out.print(">> ");
			int selectMenu = Integer.parseInt(scan.nextLine());
			
			switch(selectMenu) {
			case 1:// 성적 입력
				inputScore();
				break;
			case 2:// 성적 조회
				selectScore();
				break;
			case 3:// 석차 조회 // 심화 문제
				selectGrade();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				// execute = false; // while 반목을 종료시켜 프로그램 종료
				// return;			// main 메서드를 강제로 종료시켜 프로그램 종료
				System.exit(0);		// 프로그램 정상 종료
			default:
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("다시 확인해 주세요.");
			}
		}
	}

	private static void selectGrade() { // 석차조회
		
	}

	private static void selectScore() { // 성적조회
		
		boolean stop = false;
		Loop:
		      while(!stop) {
		         System.out.print("이름을 입력하세요 나가시려면 n을 입력하세요 : ");
		         String ckname = scan.nextLine();
		         String no = "n";
		         
		         for(int i = 0; i < names.length; i++) {
		            if(names[i].equals(ckname)){
		               for(int j = 0; j < scores[i].length; j++) {
		                  System.out.println(subjects[j]+" : "+scores[i][j]);
		               }
		               continue Loop;               
		            }
		         }
		         if(no.equals(ckname)) {
		            return;
		         }
		         System.out.println("다시 입력하세요");
		      }
		
	}

	private static void inputScore() { // 성적입력
		for(int i = 0; i < names.length; i++) {
			int sum = 0;
			System.out.print("이름을 입력하세요. : ");
			names[i] = scan.nextLine();
			for(int j = 0; j < 3; j++) {
				System.out.print(subjects[j]+"점수를 입력하세요 : ");
				scores[i][j] = Integer.parseInt(scan.nextLine());
				sum += scores[i][j];
			}
			average[i] = sum/scores[i].length;
		}
	}

}
