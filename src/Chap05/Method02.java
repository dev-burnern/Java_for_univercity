package Chap05;

public class Method02 {
    public static int div(){
        int a = 10, b = 5; // 변수 a와 b를 선언하고 초기화
        int result = a / b; // a를 b로 나눈 결과를 result에 저장

        return result;
    }

    public static void main(String[] args) {
        int num = div(); // div 메서드를 호출하여 결과를 num에 저장
        System.out.println(num);
    }
}
