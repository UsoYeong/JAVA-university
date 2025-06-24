public class FirstMethod {                          // ① FirstMethod라는 이름의 퍼블릭 클래스 선언
    public static String strBar;                     // ② 정적 변수 strBar 선언 (클래스 전체에서 하나만 공유)

    public static void main(String[] args) {        // ③ main 메서드 시작 — 프로그램의 진입점
        strBar = "----";                             // ④ strBar에 "----" 대입
        printA();                                    // ⑤ printA() 호출 → strBar 값과 "01", "02" 출력

        strBar = "****";                             // ⑥ strBar에 "****" 대입
        printA();                                    // ⑦ printA() 다시 호출 → 새 strBar 값과 "01", "02" 출력
    }                                                // ⑧ main 메서드 종료

    public static void printA() {                    // ⑨ printA 메서드 선언 — 매개변수 없이 호출 가능
        System.out.println(strBar);                  // ⑩ 현재 strBar 값 출력
        System.out.println("01");                    // ⑪ 문자열 "01" 출력
        System.out.println("02");                    // ⑫ 문자열 "02" 출력
    }                                                // ⑬ printA 메서드 종료
}                                                    // ⑭ FirstMethod 클래스 종료

