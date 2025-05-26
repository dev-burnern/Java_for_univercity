package Chap03;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner 객체 생성

        System.out.println("Enter your name: "); // 사용자에게 이름 입력 요청
        String name = input.nextLine(); // 사용자로부터 이름 입력 받기
        // Scanner 클래스의 nextLine() 메서드를 사용하여 한 줄의 문자열을 입력받음
        System.out.println("Your name is: " + name); // 입력된 이름 출력
    }
}
