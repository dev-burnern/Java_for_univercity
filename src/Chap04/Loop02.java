package Chap04;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1; // 초기값 설정
        while(choice == 1) {
            int a; // 변수 a 선언

            System.out.println("숫자를 입력하세요");
            a = sc.nextInt(); // 사용자로부터 정수 입력 받기

            if (a % 2 == 0) { // 입력받은 숫자가 짝수인지 확인
                System.out.println(a + "은(는) 짝수입니다.");
            } else {
                System.out.println(a + "은(는) 홀수입니다.");
            }
            System.out.println("계속하려면 1, 종료하려면 0을 입력하세요");
            choice = sc.nextInt(); // 사용자로부터 계속할지 여부 입력 받기
        }
        System.out.println("모든 숫자 확인 완료");
    }
}
