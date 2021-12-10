package project;

public class Main02 {

	public static void main(String[] args) {
		Week w = Week.Fri;
		
		if(w == Week.Fri) {
			System.out.println("와 금요일이다.");
		}
		
		switch(w) {
		case Sun:
			System.out.println("와 일요일이다!");
			break;
		case Mon:
			System.out.println("와 월요일이다!");
			break;
		case Tue:
			System.out.println("와 화요일이다!");
			break;
		case Wen:
			System.out.println("와 수요일이다!");
			break;
		case Tur:
			System.out.println("와 목요일이다!");
			break;
		case Fri:
			System.out.println("와 금요일이다!");
			break;
		case Sat:
			System.out.println("와 토요일이다!");
			break;
		}
	}

}