package Chap02;

public class Example01 {
    public static void main(String[] args) {

        final int SPEED = 20; // 상수 SPEED 선언 및 20으로 초기화
        int count = 10; // 변수 count 선언 및 10으로 초기화
//        SPEED = 30; // 컴파일 오류 발생: 상수는 재할당할 수 없음
        count = 11 ; // 변수 count는 재할당 가능
        System.out.print("상수 SPPED 값은 :");
        System.out.println(SPEED); // 상수 SPEED 출력
        System.out.print("변수 count 값은 :");
        System.out.println(count); // 변수 count 출력
    }
}
