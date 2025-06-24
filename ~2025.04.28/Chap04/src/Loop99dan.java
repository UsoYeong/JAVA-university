
public class Loop99dan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2;
		while (i <= 9) {

			System.out.println("***" + i + "단 ***");
			for (int j = 0; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}

			System.out.println();
			i++;
		}

	}

}
