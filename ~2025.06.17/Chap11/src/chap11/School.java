package chap11;

class Student {
	private int score;
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		if(score >= 0 && score <= 100) {
			this.score = score;
		} else {
			System.out.println("유효한 값이 아닙니다.");
		}
		this.score = score;
	}
	
}

public class School {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setScore(85);
		System.out.println("점수 : " + s.getScore());
	}
	

}
