// 사각형 클래스
class Rectangle {
    public double width;   // 가로
    public double height;  // 세로

    // 사각형 넓이 (가로 × 세로)
    double area() {
        return width * height;
    }
}

// 삼각형 클래스 (Rectangle 상속)
class Triangle extends Rectangle {
    // 오버라이딩: 삼각형 넓이 (가로 × 세로 ÷ 2)
    @Override
    double area() {
        return width * height / 2;
    }
}

//Main.java
public class shapeTest {
 public static void main(String[] args) {
     // 사각형 객체 생성 및 필드 직접 할당
     Rectangle rect = new Rectangle();
     rect.width  = 10;
     rect.height = 5;
     System.out.println("사각형 넓이: " + rect.area());   // 10 × 5 = 50

     // 삼각형 객체 생성 및 필드 직접 할당
     Triangle tri = new Triangle();
     tri.width  = 10;
     tri.height = 5;
     System.out.println("삼각형 넓이: " + tri.area());   // (10 × 5) ÷ 2 = 25
 }
}