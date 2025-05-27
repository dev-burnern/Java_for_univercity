package Chap04;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        System.out.println("숫자 3개 입력");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 첫 번째 숫자 입력
        int y = sc.nextInt(); // 두 번째 숫자 입력
        int z = sc.nextInt(); // 세 번째 숫자 입력

        if(x > y)
            if (x > z) {
                System.out.println("가장 큰 수는 " + x + "입니다.");
            } else {
                System.out.println(x + " 는 가장 큰 수가 아닙니다.");
            }
        else {
            System.out.println(x + " 는 가장 큰 수가 아닙니다.");
        }
    }
}
