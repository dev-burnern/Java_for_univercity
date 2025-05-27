package Chap04;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        System.out.println("당신의 나이를 입력하세요");

        Scanner s = new Scanner(System.in);
        int age = s.nextInt(); // 사용자로부터 나이 입력 받기

        if (age >= 19) { // 나이가 19세 이상인지 확인
            System.out.println("당신은 성인입니다.");
            System.out.println("당신은 투표를 할 수 있습니다.");
        }
        System.out.println("이 문장은 if문 외부에 있습니다");

    }
}
