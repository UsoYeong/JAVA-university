// 인터페이스 정의
interface Animal {
    // 동물이 내는 소리
    void speak();

    // 동물의 이동 방식 (선택 구현)
    void move();
        // 기본 구현: 아무 동작도 하지 않음
    
}

// Dog 클래스
	class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Bark");
    }

    @Override
    public void move() {
        System.out.println("Runs on four legs.");
    }
}

// Cat 클래스
class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println("Walks gracefully.");
    }
}

// Bird 클래스
class Bird implements Animal {
    @Override
    public void speak() {
        System.out.println("Tweet");
    }

    @Override
    public void move() {
        System.out.println("Flies in the sky.");
    }
}

// 시뮬레이터 실행 클래스
public class Test0529_07 {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Bird()
        };

        for (Animal a : animals) {
            a.speak();
            a.move();
            System.out.println();
        }
    }
}
