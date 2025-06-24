// MediaPlayer 인터페이스 정의
interface MediaPlayer {
    void play();   // 미디어 재생
    void pause();  // 미디어 일시 정지
    void stop();   // 미디어 정지
}

// MusicPlayer 클래스 구현
class MusicPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("음악을 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("음악을 일시 정지합니다.");
    }

    @Override
    public void stop() {
        System.out.println("음악을 정지합니다.");
    }
}

// VideoPlayer 클래스 구현
class VideoPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("비디오를 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("비디오를 일시 정지합니다.");
    }

    @Override
    public void stop() {
        System.out.println("비디오를 정지합니다.");
    }
}

// 실행용 테스트 클래스
public class Test0529_08 {
    public static void main(String[] args) {
        MediaPlayer music = new MusicPlayer();
        MediaPlayer video = new VideoPlayer();

        // MusicPlayer 기능 테스트
        System.out.println("=== MusicPlayer 테스트 ===");
        music.play();
        music.pause();
        music.stop();
        System.out.println();

        // VideoPlayer 기능 테스트
        System.out.println("=== VideoPlayer 테스트 ===");
        video.play();
        video.pause();
        video.stop();
    }
}

