public class Book1 {
    
    String title;
    String author;
    
    public Book1(String title) {
        // 다른 생성자를 호출
        this(title, "작가미상");
    }
    
    public Book1(String title, String author) {
        this.title  = title;
        this.author = author;
    }
    
    public static void main(String[] args) {
        // 타입을 Book1으로 변경
        Book1 b1 = new Book1("춘향전");
        Book1 b2 = new Book1("소년이 온다", "한강");
        
        System.out.println(b1.title + " " + b1.author);
        System.out.println(b2.title + " " + b2.author);
    }
}
