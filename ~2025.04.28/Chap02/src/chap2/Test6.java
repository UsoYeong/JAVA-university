package chap2;

public class Test6 {

	public static void main(String[] args) {

		byte b = 120;
		int a = 129;
		double d = 120.9;

		b = (byte) a; // a는 int인데, byte인 b로 강제 형 변환시켜서 값의 손실 발생
		a = (int) d; // d는 double인데 int인 a로 강제 형 변환시켜서 값의 손실 발생

		System.out.println("byte b = " + b); // 오버플로 발생
		System.out.println("int a = " + a); // 소수점 .9 는 버려짐
		System.out.println("double d = " + d);
		
		

	}

}

