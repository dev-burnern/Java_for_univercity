package Chap04;

public class Example03 {
    public static void main(String[] args) {
        int num = 20; // 변수 num 선언 및 20으로 초기화

        if (num == 10){
            System.out.println("num은 10입니다."); // num이 10일 때 출력
        } else if (num == 20) {
            System.out.println("num은 20입니다."); // num이 20일 때 출력
        } else if (num == 30) {
            System.out.println("num은 30입니다."); // num이 30일 때 출력
        } else {
            System.out.println("num은 10, 20, 30이 아닙니다."); // num이 위의 값들 중 하나가 아닐 때 출력
        }
    }
}
