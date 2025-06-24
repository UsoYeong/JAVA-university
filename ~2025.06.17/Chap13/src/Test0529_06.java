
interface A_int {
	void aa();
}
interface B_int {
	void bb();
}

class C implements A_int, B_int {
	public void aa() {
		System.out.println("A 인터페이스");
	}
	public void bb() {
		System.out.println("B 인터페이스");
	}
}

public class Test0529_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C();
		c.aa();
		c.bb();

	}
}
