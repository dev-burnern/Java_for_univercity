package Chap03;

public class Operator05 {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 10, d = 10; // 변수 a, b, c, d 선언 및 초기화

        System.out.println("a++ = " + a++); // a를 출력한 후 1 증가
        System.out.println("a = " + a); // 증가된 a의 값 출력
        System.out.println("++b = " + ++b); // b를 1 증가시킨 후 출력
        System.out.println("++b = " + b); // 증가된 b의 값 출력
        System.out.println("c-- = " + c--); // c를 출력한 후 1 감소
        System.out.println("--d = " + --d); // d를 1 감소시킨 후 출력
    }
}
