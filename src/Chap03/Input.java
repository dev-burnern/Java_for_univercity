package Chap03;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner 객체 생성
        System.out.println("정숫값 입력하기"); // 사용자에게 정수 입력 요청
        int x = input.nextInt(); // 사용자로부터 정수 입력 받기

        System.out.println("실숫값 입력하기"); // 사용자에게 실수 입력 요청
        double y = input.nextDouble(); // 사용자로부터 실수 입력 받기

        System.out.println("정숫값 : " + x); // 입력받은 정수 출력
        System.out.println("실숫값 : " + y); // 입력받은 실수 출력
    }
}
