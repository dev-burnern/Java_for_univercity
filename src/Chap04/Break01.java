package Chap04;

public class Break01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println("i : " + i); // i가 5가 되기 전까지 출력
        }
    }
}
