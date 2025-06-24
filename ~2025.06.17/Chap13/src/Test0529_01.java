// 다형성

class Animal_1 {
	void sound() {
		System.out.println("동물 소리");
	}
}


class Dog_1 extends Animal_1 {
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat_1 extends Animal_1 {
	@Override
	void sound() {
		System.out.println("야옹");
	}
	
	void reg() {
		System.out.println("꾹꾹이 해");
	}
}

public class Test0529_01 {

	public static void main(String[] args) {
		
		Animal_1[] arr = new Animal_1[2];
		arr[0] = new Dog_1();
		arr[1] = new Cat_1();
		
		for(Animal_1 x : arr)
		{
			x.sound();
		}
		Animal_1 d1 = new Dog_1();
		Animal_1 c1 = new Cat_1();
		
		d1.sound();
		c1.sound();

	}

}
