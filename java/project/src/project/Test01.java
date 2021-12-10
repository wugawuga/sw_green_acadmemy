package project;

public class Test01 {

	public static void main(String[] args) {
		
		
		int[] java = new int[] {50,60,70,80,90};
		
		int add = 0;
		
		for(int i = 0; i < java.length; i++) {
			add += java[i];
		}
		add = 0;
		
		for(int s:java) {
			add += s;
		}
		
		
		
		// 배열의 복사
		int[] oldArray = new int[] {2,5,7,8};
		
		// 3,4를 추가하고 싶다.
		int[] newArray = new int[10];
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		newArray[4] = 3;
		newArray[5] = 4;
		/////////////////////////////////////////////
		
		// 배열 복사를 위한 기본 기능 System.arraycopy();
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		for(int i = 0; i < newArray.length; i++) {
			System.out.println(i+"번째 데이터 : "+ newArray[i]);
		}
	}

}