package chap3;
public class StringTest1 {
	public static void main(String[] args) {
		
		
		String a = "Hello";
		String b = "Hello";
		System.out.println("a == b : " + (a == b));
		
		//이건 true

		a = a + "World";
		b = b + "World";

		System.out.println("a : " + a); 
		System.out.println("b : " + b);
		System.out.println("a == b : " + (a == b));
		
		//이건 false
		
		//String(문자열) 내용 비교할땐 == 쓰지 말고 equals 함수 사용



	}

}
