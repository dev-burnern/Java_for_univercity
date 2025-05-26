package Chap03;

public class Operator02 {
    public static void main(String[] args) {
        int a = 10, b = 20; // 변수 a와 b 선언 및 초기화
        System.out.println("a == b = " + (a == b)); // a와 b가 같은지 비교하여 false 출력
        System.out.println("a != b = " + (a != b)); // a와 b가 다른지 비교하여 true 출력
        System.out.println("a > b = " + (a > b)); // a가 b보다 큰지 비교하여 false 출력
        System.out.println("a < b = " + (a < b)); // a가 b보다 작은지 비교하여 true 출력
        System.out.println("a >= b = " + (a >= b)); // a가 b보다 크거나 같은지 비교하여 false 출력
        System.out.println("a <= b = " + (a <= b)); // a가 b보다 작거나 같은지 비교하여 true 출력
    }
}
