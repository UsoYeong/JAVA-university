class Parent1 {
	String message = "부모";
	void sayHello() {
		System.out.println("부모 : 안녕하세요");
	}
}

class Child1 extends Parent1 {
	String message = "자식";
	void sayHello() {
		System.out.println("자식 : 안녕하세요");
	}
	
	void test() {
		System.out.println(super.message);
		super.sayHello();
	}
}

public class test0522_3 {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.test();

	}

}
