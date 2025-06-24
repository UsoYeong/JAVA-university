// 추상 클래스 Employee 정의
abstract class Employee {
    String name;

    // 생성자
    Employee(String name) {
        this.name = name;
    }

    // 급여 계산을 위한 추상 메서드
    public abstract int getSalary();
}

// Manager 클래스 (Employee 상속)
class Manager extends Employee {
	
    Manager(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return 500 + 100;
    }
}

// Engineer 클래스 (Employee 상속)
class Engineer extends Employee {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return 400;
    }
}

// 실행 클래스
public class Test0529_04 {
    public static void main(String[] args) {
        // Employee 배열에 Manager와 Engineer 객체 저장
        Employee[] arr = new Employee[2];
        arr[0] = new Manager("홍길동");
        arr[1] = new Engineer("김철수");

        // 배열을 순회하며 이름과 급여 출력
        for (Employee x : arr) {
            System.out.println(x.name + "의 급여: " + x.getSalary() + "원");
            System.out.println();
        }
    }
}
