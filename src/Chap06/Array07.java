package Chap06;

public class Array07 {
    public static void main(String[] args) {
        String s1 = new String("Java"); // 문자열 s1을 new 키워드로 생성
        String s2 = new String("Java"); // 문자열 s2를 new 키워드로 생성
        String s3 = s1; // 문자열 s3는 s1을 참조

        if (s1 == s2) System.out.println("s1과 s2는 같다.");
        else System.out.println("s1과 s2는 다르다.");

        if (s1 == s3) System.out.println("s1과 s3는 같다.");
        else System.out.println("s1과 s3는 다르다.");

        if (s1.equals(s2)) System.out.println("s1과 s2는 같다.");
        else System.out.println("s1과 s2는 다르다.");
    }
}
