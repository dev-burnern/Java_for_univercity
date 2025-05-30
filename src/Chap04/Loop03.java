package Chap04;

import java.util.Scanner;

public class Loop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("10보다 큰 숫자를 입력하세요.");

        int x = sc.nextInt(); // 사용자로부터 숫자 입력 받기
        int sum = 0; // 합계를 저장할 변수 초기화

        do {
            sum += x; // 입력받은 숫자를 sum에 누적
            x--; // x를 1씩 감소시킴
        }
        while (x >= 10); // x가 10 이상인 동안 반복
        System.out.println("합계 : " + sum); // 누적된 합계 출력
    }
}
