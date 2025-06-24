class MovieHall {
    // 클래스 전체 판매 티켓 수
    static int totalTicketCnt = 0;
    // 각 홀별 판매 티켓 수
    int ticketCnt = 0;

    // 전체 판매 티켓 수 초기화
    static void resetTotalTicketCount() {
        totalTicketCnt = 0;
    }

    // 이 홀의 판매 티켓 수 초기화
    void resetTicketCount() {
        ticketCnt = 0;
    }

    // 이 홀에 티켓 count 만큼 판매, 전체 수에도 반영
    void addTicketCount(int count) {
        ticketCnt += count;
        totalTicketCnt += count;
    }

    // 전체 판매 티켓 수 반환
    static int getTotalTicketCount() {
        return totalTicketCnt;
    }
}

public class Qz1 {
    public static void main(String[] args) {
        // 전체 합계 초기화
        MovieHall.resetTotalTicketCount();

        MovieHall m1 = new MovieHall();
        MovieHall m2 = new MovieHall();

        m1.addTicketCount(30);
        m1.addTicketCount(20);
        m2.addTicketCount(35);

        System.out.println("m1 판매 티켓수 : " + m1.ticketCnt);
        System.out.println("m2 판매 티켓수 : " + m2.ticketCnt);
        System.out.println("전체 판매 티켓수 : " + MovieHall.getTotalTicketCount());
    }
}
