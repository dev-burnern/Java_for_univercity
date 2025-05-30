package Chap05;

public class Example05 {
    public static void add(int x, int y) {
        System.out.println(x + "(와)과 " + y + "의 합은 " + (x + y) + "입니다."); // 두 수의 합을 출력하는 메소드
    }

    public static void main(String[] args) {
        int a = 5, b = 6; // 변수 a와 b를 각각 5와 6으로 초기화
        add(a, b); // add 메소드를 호출하여 a와 b의 합을 출력
    }
}
