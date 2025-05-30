package Chap06;

public class Example03 {
    public static void main(String[] args) {
        int[][] myArr = new int[2][4]; // 2행 4열의 정수형 배열 myArr 선언 및 초기화
        myArr[0][0] = 2; // 0행 0열에 값 할당
        myArr[0][1] = 5; // 0행 1열에 값 할당
        myArr[0][2] = 7; // 0행 2열에 값 할당
        myArr[0][3] = 4; // 0행 3열에 값 할당
        myArr[1][0] = 9; // 1행 0열에 값 할당
        myArr[1][1] = 3; // 1행 1열에 값 할당
        myArr[1][2] = 2; // 1행 2열에 값 할당
        myArr[1][3] = 8; // 1행 3열에 값 할당

        int sum1 = 0, sum2 = 0; // 각 행의 합계를 저장할 변수 초기화

        for (int i = 0; i < 4; i++) {
            sum1 += myArr[0][i];
        }
        System.out.println("첫 번째 행의 합계 : " + sum1); // 첫 번째 행의 합계 출력

        for (int i = 0; i < 4; i++) {
            sum2 += myArr[1][i];
        }
        System.out.println("두 번째 행의 합계 : " + sum2); // 두 번째 행의 합계 출력
    }
}
