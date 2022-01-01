package sp_collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Voca {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Map<String, String> voca = new HashMap<>();
	
        voca.put("student", "학생");
        voca.put("apple", "사과");
        voca.put("banana", "바나나");
        voca.put("math", "수학");
        
        // 전체 조회
        Set<Map.Entry<String, String>> entrySet = voca.entrySet();
		
		Iterator<Map.Entry<String, String>> entryItr = entrySet.iterator();
		
		while(entryItr.hasNext()) {
			Map.Entry<String, String> entry = entryItr.next();
			System.out.println("영어 : "+entry.getKey()+" 뜻 : "+entry.getValue());
		}
		
		// 단어 조회
		
		// 단어 수정
		
		// 단어 삭제

	}

}
