package Chap02;

public class InputOutput02 {
    public static void main(String[] args) {

        String myName = "홍길동"; // 문자열 변수 myName 선언 및 "홍길동"으로 초기화
        int myAge = 25; // 정수형 변수 myAge 선언 및 25로 초기화

        System.out.println("이름 : \t" + myName); // 변수 myName 출력
        System.out.println("나이 : \t" + myAge); // 변수 myAge 출력
        System.out.println("이름 : \n" + myName + "\n나이 : \n" + myAge); // 변수 myName과 myAge를 함께 출력
    }
}
