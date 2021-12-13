package ques02;

import java.util.Scanner;

public class Student {
	
	Scanner scan = new Scanner(System.in);
	
	private String name;
	private int[] scores = new int[3];
	public String[] sub = {"국어","영어","수학"};
	private int sum;
	private double avg;
	private int num;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		avg = sum/3.0;
		this.avg = avg;
	}
	public int getNum() {
		System.out.print("인원을 입력하세요. : ");
		num = Integer.parseInt(scan.nextLine());
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}
