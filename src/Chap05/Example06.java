package Chap05;

public class Example06 {
    public static void calculate(int x, int y) {
        System.out.println(x * y);  // 두 정수 x와 y의 곱을 출력
    }
    public static void calculate(int x) {
        System.out.println(x * x);  // 정수 x의 제곱을 출
    }
    public static void calculate(int x, double y) {
        System.out.println(x * y);  // 정수 x와 실수 y의 곱을 출력
    }
    public static void calculate(double x) {
        System.out.println(x * x);  // 실수 x의 제곱을 출력
    }
    public static void main(String[] args) {
        calculate(5, 6);          // 두 정수의 곱을 출력
        calculate(5);             // 정수의 제곱을 출력
        calculate(5, 6.0);        // 정수와 실수의 곱을 출력
        calculate(5.0);           // 실수의 제곱을 출력
    }
}
