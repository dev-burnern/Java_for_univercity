package Chap04;

public class Example12 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 3 || i == 6 || i == 9) {
                continue; // i가 3 또는 6일 때, 현재 반복을 건너뜀
            }
            System.out.print(i + " "); // i가 3, 6, 9가 아닐 때만 출력
        }
    }
}
