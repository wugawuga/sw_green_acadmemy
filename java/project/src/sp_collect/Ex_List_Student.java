package sp_collect;

import java.util.ArrayList;
import java.util.List;

public class Ex_List_Student {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		// Student 인스턴스를 모아두는 리스트
		
//		students.add(new Student(15,"윤정욱"));
//		students.add(new Student(19,"우가욱"));
//		students.add(new Student(21,"우로로"));
//		
		// 우가욱 학생의 국영수 수학 점수를 입력하고 싶다면???
//		Students.get(1).setScore(new int[] {50,50,50});
		// 리스트   우가욱인스턴스.메소드
		
		// 배열이름[idx].메소드();
		
		Student[] stuList = new Student[100];
		stuList[5] = new Student(17,"윤정욱",new Teacher("윤선생","수학"));
		
		// 윤정욱 학생의 담임선생이 담당하는 과목은?
		
		String subject = stuList[5].getHomeroomTeacher().getSubject();

		// Student 인스턴스를 모아두는 리스트
		students.add(new Student(28,"최치수",new Teacher("뉴턴","뉴턴물리학")));
		
		// 최치수 담임의 이름
		students.get(0).getHomeroomTeacher().getName();
		
		// 최치수 담임의 담당과목이 뉴턴물리학??
		if(students.get(0).getHomeroomTeacher().getSubject().equals("뉴턴물리학")) {
			System.out.println("맞아");
		}
	}

}
