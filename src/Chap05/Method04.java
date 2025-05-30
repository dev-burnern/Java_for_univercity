package Chap05;

public class Method04 {
    public static void sum() {
        int sum = 0; // 합계를 저장할 변수 sum을 0으로 초기화
        for (int i = 0; i <= 10; i++) {
            sum += i; // i를 sum에 누적
        }
        System.out.println(sum); // 누적된 합계를 출력
    }

    public static void main(String[] args) {
        System.out.print("1부터 10까지의 합계 : ");
        sum();
    }
}
