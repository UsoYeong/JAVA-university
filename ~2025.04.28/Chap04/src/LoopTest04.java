
public class LoopTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		while (i <= 9) {

			System.out.println("***" + i + "단 ***");
			for (int j = 0; j <= 9; j++) {
				if (j >= 6)
					continue;
				System.out.println(i + "*" + j + "=" + i * j);
			}

			System.out.println();
			i++;
		}

	}

}
