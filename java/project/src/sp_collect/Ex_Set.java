package sp_collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex_Set {

	public static void main(String[] args) {
		
		// Set : 순서없고, 중복허용 안함
		
		
		// HashSet => 임의의 인스턴스가 어떻게 중복인지 판단 할 것인가??
		
		// TreeSet =>
		
		
		Set<String> names = new HashSet<>();
		
		names.add("박준혁");
		names.add("윤정욱");
		names.add("박민영");
		names.add("우각");
		names.add("윤정욱");
		names.add("홍길동");
		
		System.out.println("Set의 크기 : "+names.size());
		
		names.remove("우각");
		System.out.println("Set의 크기 : "+names.size());
		
		// 반복자 iterator
		
		Iterator<String> itr = names.iterator(); // 반복자 객체 생성(1회용)
		
		while(itr.hasNext()) { // 다음 꺼낼 것이 있는가???
			String str = itr.next(); // 다음 데이터를 꺼내와라!!
			
			System.out.println(str);
		}
		
	}

}




















