package test02;

public class TestCar {

	public static void main(String[] args) {
		
		new Car(); // 설계도 대로 공장에서 자동차 생산
		
		Car myCar = new Car();
	//  참조타입 변수 = 데이
		
		Car yourCar = new Car();
		
		System.out.println(myCar.color);
		System.out.println(yourCar.color);
		
		myCar.color="red";
		
		System.out.println(myCar.color);
		System.out.println(yourCar.color);
	}

}
