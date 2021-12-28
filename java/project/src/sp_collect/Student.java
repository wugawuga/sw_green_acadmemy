package sp_collect;

public class Student {
	
	private int stuCode;
	private String name;
	private int[] score;
	private int rank;
	private Teacher homeroomTeacher;
	
	
	
	
	public Student(int stuCode, String name) {
		this.stuCode = stuCode;
		this.name = name;
	}

	public Student(int stuCode, String name, Teacher homeroomTeacher) {
		this.stuCode = stuCode;
		this.name = name;
	}
	
	public Teacher getHomeroomTeacher() {
		return homeroomTeacher;
	}
	public void setHomeroomTeacher(Teacher homeroomTeacher) {
		this.homeroomTeacher = homeroomTeacher;
	}

	public int getStuCode() {
		return stuCode;
	}
	public void setStuCode(int stuCode) {
		this.stuCode = stuCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScore() {
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	
	// 학생 인스턴스가 같은지 다른지를 정해주는 기준!!!
		// 1. hashcode(); 학번이 같은 학생은 동일한 학생!!!
		// 2. equals();
		
	@Override
	public int hashCode() {
		return this.stuCode;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) { // 입력받은 객체가 학생 객체인지 판단!!!
			Student student = (Student)obj;
			return (student.getStuCode() == this.stuCode);
					//&&(student.getName().equals(this.name));
			// 학번과 학생 이름이 일치해야만 같은 학생으로 판단하겠다.
		}else {
			return false;
		}
	}
}
