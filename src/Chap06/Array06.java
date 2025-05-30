package Chap06;

public class Array06 {
    public static void main(String[] args) {
        String s = "Java Programming"; // 문자열 s 선언 및 초기화
        String s1 = "Java"; // 문자열 s1 선언 및 초기화
        String s2 = "Programming"; // 문자열 s2 선언 및 초기화
        String s3 = s1.concat(s2);
        String s4 = s.trim();

        System.out.println("s3 = " + s3); // s1과 s2를 연결한 문자열 출력
        System.out.println("s4 = " + s4); // 문자열 s의 앞뒤 공백을 제거한 결과 출력
        System.out.println("s3.equals(s4) = " + s3.equals(s4)); // s3와 s4가 같은지 비교하여 결과 출력
    }
}
