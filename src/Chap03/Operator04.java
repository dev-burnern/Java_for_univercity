package Chap03;

public class Operator04 {
    public static void main(String[] args) {
        int a = 5, b = 10; // 변수 a와 b 선언 및 초기화
        int c; // 변수 c 선언

        System.out.println(c = a);
        System.out.println(b += a);
        System.out.println(b -= a);
        System.out.println(b *= a);
        System.out.println(b /= a);
        System.out.println(b %= a);
    }
}
