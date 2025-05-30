package Chap06;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        String[] myArr; // 문자열형 배열 myArr 선언
        myArr = new String[3]; // 크기 3인 문자열형 배열 myArr 초기화

        Scanner sc = new Scanner(System.in);

        System.out.println("3개 문자열을 입력하세요.");

        for (int i = 0; i < 3; i++) {
            myArr[i] = sc.nextLine(); // 사용자로부터 문자열 입력받아 배열에 저장
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(myArr[i] + " ");
        }
    }
}
