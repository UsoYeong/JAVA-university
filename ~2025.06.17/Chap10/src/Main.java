class Builder {
	String text = "";
	
	public Builder append(String str) {
		this.text += str;
		return this;
	}
	
	public void print() {
		System.out.println(text);
	}
}
public class Main {
	public static void main(String[] args) {
		Builder b = new Builder();
		
		b.append("학교가 ").append("더워요. ").append("죽겠어요 ").append("에어컨 빵빵하게...").print();

	}

}
