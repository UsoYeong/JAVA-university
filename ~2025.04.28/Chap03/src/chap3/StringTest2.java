package chap3;
public class StringTest2 {
	public static void main(String[] args) {
		
		String a = "Hello";
		String b = new String("Hello");

		System.out.println("문자열 길이 : " + a.length());
		System.out.println("문자열 추출 : " + a.charAt(1)); // 인덱스 01234
		System.out.println("부분 추출 : " + a.substring(2));
		System.out.println("부분 추출 : " + a.substring(2, 3)); // 맨 뒤에는 선택 안함
		System.out.println("문자열 비교 : " + (a == b));
		System.out.println("문자열 비교 : " + a.equals(b)); // 그냥이거쓰기


	}

}
