
public class Qz2 {

	public static void main(String[] args) {
		
		 int a = 3;
		 // 원의 넓이
		circleArea(a);
		 // 원의 길이
		circleLine(a);
		 a = 4;
		 // 원의 넓이
		circleArea(a);
		 // 원의 길이
		circleLine(a);


	}
	public static void circleArea(int radius) {
		double result = Math.pow(radius, 2) * Math.PI;
		 System.out.println("반지름이 " + radius + "인 원의 넓이 : " + Math.round(result));
	}
	
	public static void circleLine(int radius) {
		double result = radius * 2 * Math.PI;
		 System.out.println("반지름이 " + radius + "인 원의 길이 : " + Math.round(result));
		
	}

}
