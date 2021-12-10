package project;

public class Student { // 이름, 자바, 오라클 점수를 저장하기 위한 클래스
	
//	public String userName;
//	public int javaScore;
//	public int oracleScore;
//	
//	public int[] a;
//	public Week week;
//	public String[] str;
	static String className;
	private String userName;
	private int javaScore;
	private int oracleScore;
	
// 메인에서 써먹으려면
	public void setUserName(String username) {
		this.userName = username;
	}
	public String getUserName() {
		return this.userName;
	}
	public int getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(int javaScore) {
		if(javaScore < 0 || javaScore > 100) {
			System.out.println("입력데이터에 오류가 있습니다.");
			System.out.println("다시 확인해 주세요.");
		}else {
			this.javaScore = javaScore;
		}
	}
	public int getOracleScore() {
		return oracleScore;
	}
	public void setOracleScore(int oracleScore) {
		this.oracleScore = oracleScore;
	}
}