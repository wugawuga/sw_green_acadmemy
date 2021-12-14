package quiz;

import java.util.Scanner;

public class Quiz06 { // 백준 2739번 알고리즘

	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int a = sc.nextInt();
        for(int i=1; i < 10; i++){
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }

}
