
abstract class Shape {
	protected String name;
	
	public void printName() {
		System.out.println("도형 : " + name);
	}
	public abstract double getArea();
}

class Circle extends Shape {
	double radius;
	
	Circle(double radious) {
		this.radius = radious;
		this.name = "원";
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class Test0529_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(5);
		c.printName();
		System.out.println("도형의 넓이 : " + c.getArea());

	}

}
