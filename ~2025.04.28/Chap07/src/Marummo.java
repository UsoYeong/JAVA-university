import java.util.Scanner;

public class Marummo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하세요 : ");
		int height = scanner.nextInt();
		scanner.close();
		
		int mid = height / 2;
		
		// 위쪽 삼각형
		
		for (int i = 0; i <= mid; i++) {                // 이 안쪽 루프는 공백(" ") 을 출력합니다.
			for (int j = 0; j < mid - i; j++) 			// 줄이 내려갈수록 i가 커지니까 공백은 줄어듭니다.
				System.out.print(" ");					// 별을 가운데 정렬 하기 위한 로직입니다.
			
			for (int k = 0; k < 2 * i + 1; k++) 		// 이 루프는 별(*)을 출력합니다.
				System.out.print("*"); 					// 줄마다 별의 개수는 2 * i + 1로 증가합니다.
														// (항상 홀수 개의 별을 출력해서 대칭을 만들어요)
			System.out.println();

		}

		for (int i = mid - 1; i >= 0; i--) {			// mid - 1 에서 0까지 i값은 계속 줄어듬
			for (int j = 0; j < mid - i; j++)			// mid - 1 만큼 공백을 출력함
				System.out.print(" ");
			
			for (int k = 0; k < 2 * i + 1; k++)			// i값은 계속 줄어듬
				System.out.print("*");					// 별의 개수는 2 * i + 1
			
			System.out.println();

		}

		

	}

}
