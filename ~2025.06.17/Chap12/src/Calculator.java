class Cal1 {
	public int add(int x, int y) {
		return (x + y);
	}
}

class Cal2 extends Cal1 {
	public int minus(int x, int y) {
		return (x - y);
	}
}

class Cal3 extends Cal2 {
	public int multiple(int x, int y) {
		return (x * y);
	}
}

public class Calculator {
	public static void main(String[] args) {
		Cal1 c1 = new Cal1();
		Cal2 c2 = new Cal2();
		Cal3 c3 = new Cal3();
		
		System.out.println("Cal1 더하기 : " + c1.add(5, 3));
		
		System.out.println("Cal2 더하기 : " + c2.add(5, 3));
		System.out.println("Cla2 빼기 : " + c2.minus(5, 3));
		
		
		System.out.println("Cal3 더하기 : " + c3.add(5, 3));
		System.out.println("Cal3 빼기 : " + c3.minus(5, 3));
		System.out.println("Cal3 곱하기 : " + c3.multiple(5, 3));
	}

}
