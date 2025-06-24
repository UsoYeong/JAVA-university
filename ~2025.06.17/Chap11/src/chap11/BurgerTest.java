package chap11;

class Burger {
    private String name;
    private int price;            // ① int로 변경

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        if (price >= 1000) {
            this.price = price;
        }
    }

    public String getName() {      // ② getter를 클래스 안으로
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class BurgerTest {
    public static void main(String[] args) {
        Burger b = new Burger();                          // ③ 오타 수정
        b.setName("치킨버거");
        b.setPrice(5400);

        System.out.println("버거 이름 : " + b.getName());   // ④ 인스턴스 호출
        System.out.println("버거 가격 : " + b.getPrice());
    }
}
