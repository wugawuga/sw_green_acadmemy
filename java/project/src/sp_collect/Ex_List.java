package sp_collect;

import java.util.ArrayList;
import java.util.List;

public class Ex_List {

	public static void main(String[] args) {
		
		// 리스트(interface) : 순서있고, 중복허용
		
		// ArrayList : 
		
		// LinkedList : 
	
		List<String> names = new ArrayList<>();
		
		names.add("박준혁");
		names.add("윤정욱");
		names.add("박민영");
		names.add("윤길동");
		names.add("박길동");
		
		System.out.println("리스트 길이 : "+names.size());
		
		System.out.println("2번째 사람 이름 : "+names.get(1));
		System.out.println("데이터조회---------------------------");
		
		for(int i=0;i<names.size();i++) {
			System.out.println((i)+"번 째 사람이름 : "+names.get(i));
		}
		
		names.add(3, "우가우가");
		System.out.println("데이터추가------------------------------");
		
		for(int i=0;i<names.size();i++) {
			System.out.println((i)+"번 째 사람이름 : "+names.get(i));
		}
		
		System.out.println("데이터삭제------------------");
		names.remove(1);
		for(int i=0;i<names.size();i++) {
			System.out.println((i)+"번 째 사람이름 : "+names.get(i));
		}
		
		System.out.println("데이터변경-----------------");
		names.set(2, "윤정욱");
		for(int i=0;i<names.size();i++) {
			System.out.println((i)+"번 째 사람이름 : "+names.get(i));
		}
		
		System.out.println("데이터전체제거-----------------");
		names.clear();
		for(int i=0;i<names.size();i++) {
			System.out.println((i)+"번 째 사람이름 : "+names.get(i));
		}
	}

}
