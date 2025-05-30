package Chap06;

public class Example01 {
    public static void main(String[] args) {
        int[] myArr = new int[5]; // 정수형 배열 myArr 선언 및 크기 5로 초기화
        myArr[0] = 10;
        myArr[1] = 20;
        myArr[2] = 30;
        myArr[3] = 40;
        myArr[4] = 50;

        for (int i = 0; i < 5; i++)
            System.out.println(i + "번째 요소값 : " + myArr[i]);
    }
}
