package Chap06;

public class Array04 {
    public static void main(String[] args) {
        int rows = 2, columns = 3; // 행과 열의 크기를 변수로 선언
        int[][] firstMatrix = { {2, 3, 4}, {3, 2, 1} }; // 2행 3열의 정수형 배열 firstMatrix 선언 및 초기화
        int[][] secondMatrix = { {1, 2, 3}, {-4, -2, 1}}; // 2행 3열의 정수형 배열 secondMatrix 선언 및 초기화

        int[][] sum = new int[rows][columns]; // 2행 3열의 정수형 배열 sum 선언 및 초기화
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]; // 각 요소의 합을 계산하여 sum 배열에 저장
            }
        }
        System.out.println("두 행렬의 합 : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " "); // 합계 배열의 각 요소값 출력
            }
            System.out.println(); // 각 행의 출력 후 줄바꿈
        }
    }
}
