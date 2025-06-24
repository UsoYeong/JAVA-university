package chap11;

public class Book {
	// 클래스 변수
	static int totalBooks = 0;
	
	// 객체변수
	String title; // 책이름
	String author; // 작가
	
	// 객체 메소드
	void printInfo() {
		System.out.println("제목 : " + title);
		System.out.println("작가 : " + author);
	}
	
	// 클래스 메소드
	static void printTotalBooks() {
		System.out.println("전체 책의 수 : " + totalBooks);
	}
}
