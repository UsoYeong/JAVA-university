class Parent3 {
	Parent3(String name){
		System.out.println("부모 생성자 : " + name);
	}
}

class Child3 extends Parent3{
	Child3() {
		super("홍길동");
		System.out.println("자식 생성자");
	}
}

public class Test0522_6 {
	public static void main(String[] args) {
		new Child3();

	}

}
