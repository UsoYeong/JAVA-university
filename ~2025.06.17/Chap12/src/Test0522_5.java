
class Parent2{
	Parent2(){
		System.out.println("부모 클래스 생성자");
	}
}

class Child2 extends Parent2{
	Child2() {
		super();
		System.out.println("자식 클래스 생성자");
	}
}

public class Test0522_5 {
	public static void main(String[] args) {

		new Child2();
	}

}
