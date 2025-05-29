package Chap04;

import java.util.Scanner;

public class Loop01 {
    public static void main(String[] args) {
        int sum = 0; // 합계를 저장할 변수 sum 선언 및 초기화
        System.out.println("5개의 숫자 입력");

        for (int i = 1; i <= 5; i++) {
            Scanner s = new Scanner(System.in);
            int num = s.nextInt(); // 사용자로부터 정수 입력 받기
            sum += num; // 입력받은 숫자를 sum에 누적
        }
        System.out.println("합계 : " + sum); // 누적된 합계 출력
    }
}
