package chap11;
class Score {
	private int korean;
	private int english;
	
	public void setKorean(int score) {
		if(score >= 0 && score <= 100) {
		this.korean = score;
		}
	}
	
	public void setEnglish(int score) {
		if(score >= 0 && score <= 100) {
			this.english = score;
			}
	}
	
	public int getKorean() {
		return korean;
	}
	
	public int getEnglish() {
		return english;
	}
}
public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Score s = new Score();
		s.setKorean(120);
		s.setEnglish(88);
		
		System.out.println("한국어 점수 : " + s.getKorean());
		System.out.println("영어 점수 : " + s.getEnglish());

	}

}
