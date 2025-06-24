// Main.java
class Student {
    protected int kor;
    protected int eng;
    protected int math;
    
    // (kor, eng, math)로 초기화
    public Student(int kor, int eng, int math) {
        this.kor  = kor;
        this.eng  = eng;
        this.math = math;
    }
    
    // 기본 총점 계산: kor + eng + (math × 0.5)
    public double getTotalScore() {
        return kor + eng + math * 0.5;
    }
}

class AthleteStudent extends Student {
    // super()로 부모 생성자 호출
    public AthleteStudent(int kor, int eng, int math) {
        super(kor, eng, math);
    }

    @Override
    public double getTotalScore() {
        // 국어 2배, 수학은 50%만 반영
        return kor * 2 + eng + math * 0.5;
    }
}

class ArtStudent extends Student {
    // super()로 부모 생성자 호출
    public ArtStudent(int kor, int eng, int math) {
        super(kor, eng, math);
    }

    @Override
    public double getTotalScore() {
        // 예체능 특기생: kor + eng + math
        return kor + eng + math;
    }
}

public class TestStudent {
    public static void main(String[] args) {
        // 각 유형의 학생 생성 (80, 85, 90)
        Student general = new Student(80, 85, 90);
        System.out.println("일반 학생 총점: " + general.getTotalScore());

        AthleteStudent athlete = new AthleteStudent(80, 85, 90);
        System.out.println("체육 특기생 총점: " + athlete.getTotalScore());

        ArtStudent art = new ArtStudent(80, 85, 90);
        System.out.println("예체능 특기생 총점: " + art.getTotalScore());
    }
}
