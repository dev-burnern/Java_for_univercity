package Chap04;

import java.util.Scanner; // Scanner 클래스를 사용하여 사용자 입력을 처리하기 위한 import 문

public class If03 {
    public static void main(String[] args) {
        System.out.print("점수 입력 : "); // 사용자에게 점수 입력 요청

        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        int grade = sc.nextInt(); // 사용자로부터 점수 입력 받기

        if (grade >= 90) { // 점수가 90 이상인 경우
            System.out.println("A학점입니다.");
        } else if (grade >= 80) { // 점수가 80 이상 90 미만인 경우
            System.out.println("B학점입니다.");
        } else if (grade >= 70) { // 점수가 70 이상 80 미만인 경우
            System.out.println("C학점입니다.");
        } else if (grade >= 60) { // 점수가 60 이상 70 미만인 경우
            System.out.println("D학점입니다.");
        } else { // 점수가 60 미만인 경우
            System.out.println("F학점입니다.");
        }
    }
}
