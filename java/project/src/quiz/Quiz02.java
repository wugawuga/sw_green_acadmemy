package quiz;

import java.util.Scanner;

public class Quiz02 { // 백준 10430번 알고리즘
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}

}
