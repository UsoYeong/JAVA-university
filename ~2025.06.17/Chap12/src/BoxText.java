// BoxText.java
public class BoxText {
    private int width;
    private int height;
    private int depth;
    private int volume;
    private int fee;

    public BoxText(int width, int height, int depth) {
        this.width  = width;
        this.height = height;
        this.depth  = depth;

        this.volume = width * height * depth;
        this.fee    = (this.volume >= 1000) ? 5000 : 3000;
    }

    public int getVolume() {
        return volume;
    }

    public int getFee() {
        return fee;
    }
    
 // BoxTextTest.java
    public class BoxTextTest {
        public static void main(String[] args) {
            // BoxText 객체 생성
            BoxText box = new BoxText(10, 20, 30);

            // 결과 출력
            System.out.println("부피(volume): " + box.getVolume());
            System.out.println("요금(fee):     " + box.getFee());
        }
    }

}
