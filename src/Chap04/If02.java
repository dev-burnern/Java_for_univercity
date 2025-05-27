package Chap04;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        System.out.println("숫자 입력 : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 사용자로부터 정수 입력 받기

        if (num % 2 == 0) {
            System.out.println(num + "은(는) 짝수입니다.");
        }
        else {
            System.out.println(num + "은(는) 홀수입니다.");
        }
        System.out.println("이 문장은 if문 외부에 있습니다.");
    }
}
