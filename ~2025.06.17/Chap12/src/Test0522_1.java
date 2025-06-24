
class Animal {
	void sound() {
		System.out.println("동물의 소리를 냅니다.");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("멍멍!");
	}
	
}

public class Test0522_1 {
	public static void main(String[] args) {
		Animal a = new Animal();
		
		Dog d = new Dog();
		
		a.sound();
		d.sound();

	}

}
