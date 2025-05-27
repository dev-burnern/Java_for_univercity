package Chap04;

public class Example05 {
    public static void main(String[] args) {
        int age = 20;
        String message = (age > 18 ) ? "투표 할 자격이 있습니다" : "투표 할 자격이 없습니다"; // 삼항 연산자를 사용하여 메시지 결정
        System.out.println(message); // 결정된 메시지 출력
    }
}
