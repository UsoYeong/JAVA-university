import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		String[] students = {"Kim", "Lee", "Park", "Choi", "Jung"};
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String input = Scanner.nextLine();
		
		boolean flag = false;
		for (String name : students) {
			if (name.equals(input)) {
				flag = true;
				break;
			}
		}
		
		if(flag) System.out.println("존재합니다.");
		else System.out.println("존제하지 않습니다.");
		
		

	}

}
