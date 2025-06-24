package chap3;

public class SwitchTest {

	public static void main(String[] args) {
		
		int i = 5;

		switch (i) {

		case 1:
			System.out.println(i + "는 1입니다");
			break;
		case 2:
			System.out.println(i + "는 2입니다");
			break;
		case 3:
			System.out.println(i + "는 3입니다");
			break;
		case 4:
			System.out.println(i + "는 4입니다");
			break;
		default:
			System.out.println(i + "는 1~4가 아닙니다.");
		}


	}

}
