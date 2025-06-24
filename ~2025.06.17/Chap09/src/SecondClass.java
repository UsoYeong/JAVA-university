class PrintBB {
    public static String strClass;      // (1) 클래스 변수(static field): PrintBB 클래스에 단 하나만 존재, 모든 인스턴스가 공유
    public String strBar;               // (2) 인스턴스 변수(field): 각 객체마다 별도로 존재

    public void printB() {              // (3) 인스턴스 메서드: 클래스 변수만 출력
        System.out.println(strClass);   // → static 변수 strClass 출력
        // System.out.println(strBar);  // (4) 주석 처리된 부분: 인스턴스 변수는 여기에선 출력하지 않음
    }

    public void printA() {              // (5) 인스턴스 메서드: 클래스 변수와 인스턴스 변수 모두 출력
        System.out.println(strClass);   // → static 변수 strClass 출력
        System.out.println(strBar);     // → 해당 객체의 strBar 출력
    }
}

public class SecondClass {
    public static void main(String[] args) {
        // ── static 변수 사용 예시 ──────────────────────────
        PrintBB.strClass = "클래스";      // (6) 클래스 이름으로 static 변수에 직접 값 대입
        new PrintBB().printB();          // (7) 인스턴스를 바로 생성해 printB() 호출  
                                         //     → 출력:  
                                         //       클래스  

        System.out.println("--------------"); // 구분선

        // ── 인스턴스 변수 사용 예시 ────────────────────────
        PrintBB p1 = new PrintBB();      // (8) PrintBB 객체 p1 생성
        PrintBB p2 = new PrintBB();      // (9) PrintBB 객체 p2 생성

        p1.strBar = "객체1";              // (10) p1 인스턴스 변수에 값 설정
        p2.strBar = "객체2";              // (11) p2 인스턴스 변수에 값 설정

        // ── printA() 호출 순서별 출력 ───────────────────────
        p1.printA();                      // (12) →  
                                         //       클래스  
                                         //       객체1
        p2.printA();                      // (13) →  
                                         //       클래스  
                                         //       객체2
        p1.printA();                      // (14) →  
                                         //       클래스  
                                         //       객체1
        p2.printA();                      // (15) →  
                                         //       클래스  
                                         //       객체2
    }
}

