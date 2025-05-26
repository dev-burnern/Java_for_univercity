package Chap03;

public class Operator03 {
    public static void main(String[] args) {
        int a = 5, b = 10; // 변수 a와 b 선언 및 초기화

        System.out.println(a > b); // a가 b보다 큰지 비교하여 false 출력
        System.out.println(!(a < b)); // a가 b보다 작은지 비교하여 false의 반대인 true 출력
        System.out.println((a == b) && (a == 5)); // a가 b와 같고 a가 5인지 비교하여 false 출력
        System.out.println((a != b) && (a == 5)); // a가 b와 다르고 a가 5인지 비교하여 true 출력
        System.out.println(!(a != b) && (a == 5)); // a가 b와 다르지 않고 a가 5인지 비교하여 true 출력
    }
}
