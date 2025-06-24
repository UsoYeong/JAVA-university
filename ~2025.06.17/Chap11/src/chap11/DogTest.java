package chap11;

class Dog {
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = 2025 - age;
	}
	
	public String getName() { 
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("콩이", 2014);
		System.out.println("이름은 : " + d.getName());
		System.out.println("나이 : " + d.getAge());

	}

}
