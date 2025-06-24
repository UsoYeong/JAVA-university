package chap11;

public class CarSpeed {

	public static void main(String[] args) {
		Car c = new Car("테슬라");
		
		c.accelerate(70);
		c.brake(30);
		
		c.displayInfo();

	}

}
