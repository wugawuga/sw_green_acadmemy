package quiz;

import java.util.Scanner;

public class Quiz07 { // 백준 8393번 알고리즘
		
		static Scanner sc = new Scanner(System.in);
	    public static void main(String[] args){
		        int A = sc.nextInt();
		        int sum = 0;
		        for(int i = 0; i <= A; i++) {
		        	sum += i;
		        }
		        System.out.println(sum);
		}
}

