// 부모 클래스 Robot
class Robot {
    public String type = "일반 로봇";
    
    public void greet() {
        System.out.println("안녕하세요. 저는 " + type + "입니다.");
    }
}

// 자식 클래스 CleaningRobot
class CleaningRobot extends Robot {
    // 부모의 type 필드를 가린다(shadowing)
    public String type = "청소 로봇";
    
    // 부모의 greet()를 오버라이딩
    @Override
    public void greet() {
        System.out.println("안녕하세요. 저는 " + type + "입니다.");
    }
    
    // 부모의 기능을 활용하는 introduce() 메서드
    void introduce() {
        // 1) 부모 클래스의 type 출력
        System.out.println("부모 타입: " + super.type);
        
        // 2) 부모 클래스의 greet() 호출
        super.greet();
        
        // 3) (선택) 자식 클래스의 greet() 호출하여 비교 출력
        greet();
    }
}
// RobotTest.java
public class RobotTest {
	
	public static void main(String[] args) {
		
		CleaningRobot cleaner = new CleaningRobot();
		cleaner.introduce();
 }
}
