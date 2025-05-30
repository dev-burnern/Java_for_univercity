package Chap06;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        double[][] marks = new double[2][3]; // 2행 3열의 실수형 배열 marks 선언 및 초기화
        Scanner s = new Scanner(System.in);  // Scanner 객체 생성

        for (int i = 0; i < 2; i++) {
            System.out.println("학생번호" + (i + 1)); // 학생 번호 출력
            System.out.print("국어점수 : "); // 국어 점수 입력 요청
            marks[i][0] = s.nextDouble(); // 국어 점수 입력받아 배열에 저장

            System.out.print("수학점수 : "); // 수학 점수 입력 요청
            marks[i][1] = s.nextDouble(); // 수학 점수 입력받아 배열에 저장

            marks[i][2] = (marks[i][0] + marks[i][1]) / 2; // 평균 점수 계산 및 저장
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("학생번호" + (i + 1)); // 학생 번호 출력
            System.out.println("국어점수 : " + marks[i][0]); // 국어 점수 출력
            System.out.println("수학점수 : " + marks[i][1]); // 수학 점수 출력
            System.out.println("평균점수 : " + marks[i][2]); // 평균 점수 출력
        }
    }
}
