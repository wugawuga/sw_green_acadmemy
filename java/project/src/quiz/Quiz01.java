package quiz;

import java.util.Scanner;

public class Quiz01 { // 백준 2588번 알고리즘

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a*(b%10));
		int c = b/10;
		System.out.println(a*(c%10)*10);
		int d = c/10;
		System.out.println(a*d*100);
		System.out.println(a*(b%10)+a*(c%10)*10+a*d*100);
	}

}
