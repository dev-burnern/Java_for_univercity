package Chap06;

public class Example07 {
    public static void main(String[] args) {
        String s1 = "Java"; // 문자열 s1 선언 및 초기화
        String s2 = "Java"; // 문자열 s2 선언 및 초기화
        String s3 = "Java"; // 문자열 s3 선언 및 초기화
        System.out.println(s1 == s2); // s1과 s2가 같은 객체인지 비교하여 결과 출력
        System.out.println(s1 != s2); // s1과 s2가 다른 객체인지 비교하여 결과 출력

        System.out.println(s2 == s3); // s2와 s3가 같은 객체인지 비교하여 결과 출력
        System.out.println(s2 != s3); // s2와 s3가 다른 객체인지 비교하여 결과 출력

        String s4 = s2 + s3;
        System.out.println(s4);
    }
}
