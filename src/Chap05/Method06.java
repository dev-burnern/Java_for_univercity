package Chap05;

public class Method06 {
    public static int sum(int x, int y) {
        return (x + y); // 두 정수 x와 y를 더한 값을 반환
    }

    public static int sum(int x, int y, int z) {
        return (x + y + z);
    }

    public static double sum(double x, double y) {
        return (x + y); // 두 실수 x와 y를 더한 값을 반환
    }

    public static void main(String[] args) {
        System.out.println("sum(10, 20)의 값 : " + sum(10, 20)); // 정수 두 개의 합
        System.out.println("sum(10, 20, 30)의 값 : " + sum(10, 20, 30)); // 정수 세 개의 합
        System.out.println("sum(10.5, 20.5)의 값 : " + sum(10.5, 20.5)); // 실수 두 개의 합
    }
}
