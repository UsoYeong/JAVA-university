package chap3;

public class Three {

	public static void main(String[] args) {
		
		//3항연산자
		
		int i = 0;

		int j = (i > 0) ? 10 : 20;
		int k = (i == 0) ? 10 : 20;

		System.out.println("j = " + j);
		// false 여서
		System.out.println("k = " + k);
		// true 여서


	}

}
