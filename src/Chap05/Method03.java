package Chap05;

public class Method03 {
    public static int max(int x, int y) {
        int result; // 결과를 저장할 변수 선언
        if (x > y) result = x; // x가 y보다 크면 x를 result에 저장
        else result = y; // 그렇지 않으면 y를 result에 저장
        return result; // result 반환
    }

    public static void main(String[] args) {
        int a = 5, b = 6; // a와 b 변수 선언 및 초기화
        int num = max(a, b); // max 메서드를 호출하여 a와 b 중 큰 값을 num에 저장
        System.out.println(a + "(와)과 " + b + "의 수 중 " + num + "이 큽니다."); // 결과 출력
    }
}
