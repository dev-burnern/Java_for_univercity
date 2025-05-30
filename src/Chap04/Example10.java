package Chap04;

public class Example10 {
    public static void main(String[] args) {
        for (int i = 2; i <= 4; i++) {
            System.out.println("구구단 " + i + " 단"); // i가 2부터 4까지 반복
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j)); // i와 j의 곱을 출력
            }
        }
    }
}
