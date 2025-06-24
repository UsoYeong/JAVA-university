class Dog {
	String name;
	int age;
	
	Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void bark() {
		System.out.println("멍멍!");
	}
}
class Cat {
	String name;
	int age;
	
	Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void meow() {
		System.out.println("야옹!");
	}
}
public class House {
	public static void main(String[] args) {
		
		Dog dog = new Dog("사랑이", 10);
		System.out.println("이름 : " + dog.name + " 나이 : " + dog.age);
		dog.bark();
		
		Cat cat = new Cat("냥냥이", 9);
		System.out.println("이름 : " + cat.name + " 나이 : " + cat.age);
		cat.meow();

	}

}
