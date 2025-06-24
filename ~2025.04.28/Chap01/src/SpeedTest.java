 
public class SpeedTest {
	
 public static void main(String[] args) {
				 
				 
			 // int 속도 테스트
				 
				 
			long start = System.nanoTime();
			 int n1 = 0;
			 for (int i = 0; i < 1_000_000; i++) {
			 n1 = 1;
			 }
			 long end = System.nanoTime();
			 System.out.println("int 시간: \t" + (end - start) + " ns");
			 // boolean 속도 테스트
			start = System.nanoTime();
			 boolean n2 = true;
			 for (int i = 0; i < 1_000_000; i++) {
			 n2 = false;
			 }
			 end = System.nanoTime();
			 System.out.println("boolean 시간: \t" + (end - start) + " ns");
			 }
			 }

	


