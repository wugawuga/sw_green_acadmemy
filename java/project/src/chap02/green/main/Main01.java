package chap02.green.main;

import chap02.green.admin.Admin;
// import chap02.green.admin.Teacher;
// import chap02.green.class704.Teacher; 오류가 뜸

public class Main01 {

	public static void main(String[] args) {
		// class704
		chap02.green.class704.Student student= new chap02.green.class704.Student();
		Teacher teacher704 = new Teacher();
		
		// admin
		Admin admin = new Admin();
		Teacher teacherAdmin = new Teacher();
		
		CheckDefault cdf = new CheckDefault();
	}

}
