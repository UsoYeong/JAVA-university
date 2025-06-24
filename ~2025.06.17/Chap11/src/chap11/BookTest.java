package chap11;

class Book_7 {
	private String title;
	private String author;
	
	public Book_7(String title, String auther) {
		this.title = title;
		this.author = author;
		
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
}
	public class BookTest {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Book_7 b = new Book_7("채식주의자", "한강");
			System.out.println("제목 : " + b.getTitle());
			System.out.println("작가 : " + b.getAuthor()); // 이거 하면 null 뜸, 왜인지 알 필요 O

	}

}
