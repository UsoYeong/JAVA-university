package chap2;

public class Test7 {

	public static void main(String[] args) {

		int i1 = 0;
		int i2 = 0;
		int x;
		int y;
		
		
		x = i1++; // x에 i1의 현재 값(0)을 먼저 저장하고, 그 다음 i1을 1 증가시킴
		y = ++i2; // 먼저 i2를 1 증가시키고, 그 다음 증가된 값을 y에 저장
		
		System.out.println("i1 = " + i1); // i1++ 사용 후, 1 증가
		System.out.println("i2 = " + i2); // ++i2 에서 먼저 1 증가
		// 어땠든 두 경우 다 변수 자체는 증가했으므로 최종적으로 1이 됨
		System.out.println("i1++ = " + x);
		System.out.println("++i2 = " + y);
		

	}

}
