class Book {
	
	String title;
	String author;
	int price;
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void displayInfo() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
}
	
	
public class BookClass {
	public static void main(String[] args) {
		
		Book b1 = new Book("고등어", "공지영", 5000);
		Book b2 = new Book("정의란 무엇인가", "마이클 센델", 15000);
		Book b3 = new Book("닥터스", "에릭시겔", 12000);
		b1.displayInfo();
		b2.displayInfo();
		b3.displayInfo();
		
		
	}

}


