abstract class Shape {
    protected String name;

    public void printName() {
        System.out.println("도형 : " + name);
    }

    public abstract double getArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
        this.name = "원";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.name = "사각형";
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Test0529_03 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.printName();
        System.out.println("도형의 넓이 : " + c.getArea());

        Rectangle r = new Rectangle(4, 6);
        r.printName();
        System.out.println("도형의 넓이 : " + r.getArea());
    }
}
