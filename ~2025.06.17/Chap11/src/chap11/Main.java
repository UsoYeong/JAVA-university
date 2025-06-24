package chap11;

// 문자열을 누적하고 출력하는 빌더 클래스
class Builder {
    private String text = "";

    // Builder 자신을 반환하도록 수정
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
        // Builder 객체를 생성
        Builder b = new Builder();
        b.append("Hello")
         .append(", ")
         .append("World!")
         .print();
    }
}
