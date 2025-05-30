package Chap04;

import java.util.Scanner;

public class Loop01_2 {
    public static void main(String[] args) {
        int sum = 0; // 합계를 저장할 변수 선언 및 초기화
        System.out.println("5개의 숫자를 입력하세요.");
        int num[] = new int[5]; // 5개의 숫자를 저장할 배열 선언

        for (int n = 0; n < 5; n++) { // 0부터 4까지 반복
            Scanner sc = new Scanner(System.in); // Scanner 객체 생성
            num[n] = sc.nextInt(); // 사용자로부터 숫자 입력 받기
        }

        for (int i:num) {
            sum += i; // 배열의 각 요소를 합계에 더하기
        }
        System.out.println("합계 : " + sum); // 합계 출력
    }
}
