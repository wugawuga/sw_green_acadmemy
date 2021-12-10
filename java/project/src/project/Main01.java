package project;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {

		// 메서드를 만들어 봅시다.
		// 학생 수를 입력 받아서 기능을 동작 시키는 메서드
		// 학생 수만큼 정수를 입력 받아서 그 점수들을 반환하는 메서드

		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요. : ");
		int number = scan.nextInt();
		
		inputScores(number);
	}

	private static int[] inputScores(int number) {
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[number];
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i+1)+"번째 학생 점수 입력 : ");
			scores[i] = scan.nextInt();
		}
		
		return scores;
	}
}
