package Chap03;

public class TypeConversion {
    public static void main(String[] args) {
        int x = 10;  // 정수형 변수 x 선언 및 초기화
        double y = 3.0; // 실수형 변수 y 선언 및 초기화

        System.out.println(x / y); // x를 y로 나누어 결과 출력
        System.out.println(x / (int)y); // y를 정수형으로 변환하여 x를 나누어 결과 출력
        System.out.println((int) (x / y)); // x를 y로 나눈 결과를 정수형으로 변환하여 출력
    }
}
