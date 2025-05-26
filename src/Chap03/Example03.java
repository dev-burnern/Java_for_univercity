package Chap03;

public class Example03 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x < 10 && x < 20); // x가 10보다 작고 20보다 작은지 비교하여 false 출력
        System.out.println(x < 10 || x < 20); // x가 10보다 작거나 20보다 작은지 비교하여 true 출력
        System.out.println(!(x < 10 && x < 20)); // x가 10보다 작고 20보다 작은지 비교하여 false의 반대인 true 출력
    }
}
