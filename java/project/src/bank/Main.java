package bank;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int don = 0;
	
	public static void main(String[] args) {
		
		boolean start = false;
		while(!start) {
			
			System.out.println("은행 예금");
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">> ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				keepdon();
				break;
			case 2:
				minusdon();
				break;
			case 3:
				checkdon();
				break;
			case 4:
				System.out.println("프로그램을 종료해요");
				System.exit(0);
			default:
				System.out.println("다시 입력해주세요");
			}
			
		}
	}
	

	private static void checkdon() {
		System.out.println("잔고는 "+don+"입니다.");
		System.out.print("나가시려면 0을 입력하세요 : ");
		int ckdon = sc.nextInt();
		if(ckdon == 0) {
			System.out.println("잔액조회를 종료합니다");
			return;
		}
	}

	private static void minusdon() {
		System.out.print("얼마를 출금하시겠어요? ");
		int minusdon = sc.nextInt();
		if(minusdon > 0) {
			don -= minusdon;
			System.out.println("잔액은 "+don+"입니다");
		}else if(minusdon <= 0) {
			System.out.println("다시 입력하세요");
		}
	}

	private static void keepdon() {
		
		System.out.print("예금할 돈을 입력하세요 나가시려면 0을 입력하세요 : ");
		int kdon = sc.nextInt();
		int no = 0;
		
		if(kdon == no) {
			System.out.println("예금을 종료해요");
			return;
		}else if(kdon > 0) {
			don += kdon;
		}
	}

}
