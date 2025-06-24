package chap11;

public class Library {

	public static void main(String[] args) {
		
		Book_1 b1 = new Book_1("채식주의자", "한강");
		Book_1 b2 = new Book_1("갈매기의 꿈", "리처드");
		Book_1 b3 = new Book_1();
		
		b1.printInfo();
		b2.printInfo();
		Book_1.printTotalBooks();

	}

}
