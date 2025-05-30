package Chap06;

public class Example04 {
    public static void main(String[] args) {
        int[][] myArr = {{1, 2, 3, 4, 5}, // c 배열 방식이 아닌 자바 배열 방식을 사용함
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}}; // 3행 5열의 정수형 배열 myArr 선언 및 초기화

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(myArr[i][j] + " "); // 배열의 각 요소값 출력
            }
            System.out.println(); // 각 행의 출력 후 줄바꿈
        }
        System.out.println("myArr[0][1] 값 " + myArr[0][1]); // 0행 1열의 값 출력
    }
}