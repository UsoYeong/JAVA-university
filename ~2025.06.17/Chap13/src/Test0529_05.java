// 인터페이스 선언
interface Animal_2 {
    // 인터페이스 메서드는 암묵적으로 public abstract
    void sound();
}

// Dog_2 클래스는 Animal_2 인터페이스를 구현(implements) 
class Dog_2 implements Animal_2 {
    // 인터페이스 메서드를 구현할 땐 public 접근자를 반드시 붙여야 함
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
    
    public void ball() {
        System.out.println("공 물어와");
    }
}

// Cat_2 클래스도 Animal_2 인터페이스를 구현
class Cat_2 implements Animal_2 {
    @Override
    public void sound() {
        System.out.println("야옹");
    }
    
    public void reg() {
        System.out.println("꾹꾹이 해");
    }
}

// 실행 클래스
public class Test0529_05 {
    public static void main(String[] args) {
        // 다형성: Animal_2 타입 배열에 Dog_2, Cat_2 담기
        Animal_2[] arr = { new Dog_2(), new Cat_2() };
        
        for (Animal_2 a : arr) {
            a.sound();
            
            // 필요하다면 instanceof로 구체 타입 확인 후 추가 메서드 호출
            if (a instanceof Dog_2) {
                ((Dog_2) a).ball();
            } else if (a instanceof Cat_2) {
                ((Cat_2) a).reg();
            }
            
            System.out.println();
        }
        
        // 직접 생성해서 호출
        Animal_2 d1 = new Dog_2();
        Animal_2 c1 = new Cat_2();
        
        d1.sound();  // 멍멍
        c1.sound();  // 야옹
    }
}
