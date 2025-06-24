package chap11;

class Car {
	private String brand;
	private int speed;
	
	public Car(String brand) {
		this.brand = brand;
		this.speed = 0;
	}
	public void accelerate(int increment) {
		speed += increment;
	}
	public void brake(int decrement) {
		speed -= decrement;
	}
	
	public void displayInfo() {
		System.out.println("브랜드 : " + brand);
		System.out.println("스피드 : " + speed);
	}


}


