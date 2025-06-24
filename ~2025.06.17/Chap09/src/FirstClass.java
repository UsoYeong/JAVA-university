class PrintAA {                                       // PrintAA 클래스 선언
    public static String strBar;                      // 정적 변수 strBar 선언 (클래스 전체에서 하나만 존재)

    public static void printA() {                     // 정적 메서드 printA 선언
        System.out.println(strBar);                   // ① 현재 strBar 값을 출력
        System.out.println("01");                     // ② 문자열 "01" 출력
        System.out.println("02");                     // ③ 문자열 "02" 출력
    }                                                 // printA 메서드 종료
}                                                     // PrintAA 클래스 종료

public class FirstClass {                             // 퍼블릭 클래스 FirstClass 선언
    public static void main(String[] args) {          // main 메서드(프로그램 시작 지점)
        PrintAA.strBar = "----";                      // ④ PrintAA.strBar에 "----" 대입
        PrintAA.printA();                             // ⑤ PrintAA.printA() 호출 → ----, 01, 02 출력
        
        PrintAA.strBar = "****";                      // ⑥ PrintAA.strBar에 "****" 대입
        PrintAA.printA();                             // ⑦ PrintAA.printA() 호출 → ****, 01, 02 출력
    }                                                 // main 메서드 종료

    public static String strBar;                      // ⑧ FirstClass에 선언된 strBar (사용되지 않음)
}                                                     // FirstClass 클래스 종료