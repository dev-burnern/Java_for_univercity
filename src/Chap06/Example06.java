package Chap06;

public class Example06 {
    public static void main(String[] args) {
        String s = "Java Programming"; // 문자열 s 선언 및 초기화
        System.out.println("s.length() = " + s.length()); // 문자열 길이 출력
        System.out.println("s.charAt(2) = " + s.charAt(2)); // 문자열의 2번째 인덱스 문자 출력
        System.out.println("s.substring(6) = " + s.substring(6)); // 문자열의 6번째 인덱스부터 끝까지 출력
        System.out.println("s.substring(5, 13) = " + s.substring(5, 13)); // 문자열의 5번째 인덱스부터 13번째 인덱스까지 출력
        System.out.println("s.indexOf('g') = " + s.indexOf('g')); // 문자열에서 'g'의 첫 번째 인덱스 출력
        System.out.println("s.toLowerCase() = " + s.toLowerCase()); // 문자열을 소문자로 변환하여 출력
        System.out.println("s.toUpperCase() = " + s.toUpperCase()); // 문자열을 대문자로 변환하여 출력
    }
}
