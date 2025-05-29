package Chap04;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        System.out.println("점수 입력");

        Scanner sc = new Scanner(System.in); // Scanner 객체 생성하여 사용자 입력을 처리하기 위한 준비
        int num = sc.nextInt(); // 사용자로부터 정수 입력 받기

        switch (num / 10) {
            case 10 : // break가 없으면 다음 case로 넘어감
            case 9 :
                System.out.println("A학점입니다."); // 90점 이상일 때 출력
                break; // switch 문 종료
            case 8 :
                System.out.println("B학점입니다."); // 80점 이상 90점 미만일 때 출력
                break; // switch 문 종료
            case 7 :
                System.out.println("C학점입니다."); // 70점 이상 80점 미만일 때 출력
                break; // switch 문 종료
            case 6 :
                System.out.println("D학점입니다."); // 60점 이상 70점 미만일 때 출력
                break; // switch 문 종료
            default : // num을 10으로 나눈 몫이 어디에도 속하지 않으면
                System.out.println("F학점입니다.");
                break; // switch 문 종료
        }
    }
}
