package Chap05;

public class Example03 {
    public static int add(int x, int y) {
        return x + y; // 두 정수 x와 y를 더한 값을 반환
    }

    public static void main(String[] args) {
        int a = 5, b = 6;
        int sum = add(a, b); // add 메서드를 호출하여 a와 b의 합을 구함
        System.out.println(a + "(와)과 " + b  + "의 합은 " + sum + "입니다."); // 결과 출력
    }
}
