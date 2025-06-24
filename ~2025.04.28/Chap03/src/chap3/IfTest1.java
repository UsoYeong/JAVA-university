package chap3;

public class IfTest1 {

	public static void main(String[] args) {
		
		
		int i = 30;

		if (i > 50) {
			System.out.println(i + "는 50보다 큽니다.");

		} else if (i > 30) {
			System.out.println(i + "는 30보다 크고 50보다 작습니다.");
		} else if (i > 30) {
			System.out.println(i + "는 20보다 크고 30보다 작습니다.");
		} else {
			System.out.println(i + "는 50보다 작습니다.");
		}


	}

}
