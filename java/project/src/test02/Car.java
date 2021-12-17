package test02;

public class Car {
	
	String color = "white";
	int speed=0;
	
	void forward() {
		System.out.println("전진합니다");
		speed++;
	}
	void backward() {
		System.out.println("후진합니다");
		speed--;
	}
}
