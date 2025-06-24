
public class Qz4 {

	public static void main(String[] args) {
	int score = 85;
	boolean nFlag = false;
	
	getGrade(score, nFlag);
	}
	
	public static void getGrade(int score, boolean nFlag) {
		String grade;

		 if (nFlag) {
			 grade = "F";
			 } else {
			 if (score >= 90) {
			 grade = "A";
			 } else if (score >= 80) {
			 grade = "B";
			 } else if (score >= 70) {
			 grade = "C";
			 } else {
			 grade = "F";
			 }
			 }
			 System.out.println("Grade: " + grade); // Grade: B
	}

}
