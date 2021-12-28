package sp_collect;

import java.util.HashSet;
import java.util.Set;

public class Ex_set_Student {

	public static void main(String[] args) {
		
		Set<Student> stuSet = new HashSet<>();
		
		stuSet.add(new Student(10,"우가"));
		stuSet.add(new Student(10,"정욱"));
		stuSet.add(new Student(100,"윤정"));
	
		System.out.println("학생 수 : "+stuSet.size());
	}

}
