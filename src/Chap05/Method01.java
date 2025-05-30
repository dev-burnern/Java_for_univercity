package Chap05;

public class Method01 {
    public static void method() {
        System.out.println("static 메서드입니다."); // static 메서드 정의
        System.out.println(5 + 6); // 5와 6을 더한 결과 출력
    }
    public static void main(String[] args) {
        System.out.println("첫 번째 호출 메서드입니다."); // 메인 메서드 시작

        method(); // static 메서드 호출

        System.out.println("두 번째 호출 메서드입니다."); // 두 번째 호출 출력

        method(); // static 메서드 다시 호출
    }
}
