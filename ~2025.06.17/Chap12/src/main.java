
// Car 클래스 (public 없이 정의)
class Car {
    public String model;
    public int speed;

    public void drive() {
        System.out.println(model + "이(가) 시속 " + speed + "km로 달립니다");
    }
}

// ElectricCar 클래스 (Car 상속)
class ElectricCar extends Car {
    public int battery;

    void charge() {
        System.out.println("배터리를 충전합니다");
    }
}

//Main.java
public class main {
 public static void main(String[] args) {
     // ElectricCar 객체 생성 (모델명, 속도, 배터리 잔량)
     ElectricCar myEv = new ElectricCar();
     
     myEv.model = "테슬라";
     myEv.speed = 130;
     myEv.battery = 80;
     // 상속받은 drive() 호출
     myEv.drive();      // 출력: 테슬라 모델3이(가) 시속 120km로 달립니다

     // ElectricCar 고유 메서드 charge() 호출
     myEv.charge();     // 출력: 배터리를 충전합니다
 }
}

