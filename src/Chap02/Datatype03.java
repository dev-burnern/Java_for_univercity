package Chap02;

public class Datatype03 {
    public static void main(String[] args) {
        char ch1 = 'J'; // 문자형 변수 ch1 선언 및 'J'로 초기화
        char ch2 = 'A'; // 문자형 변수 ch2 선언 및 'A'로 초기화
        char ch3 = 'V'; // 문자형 변수 ch3 선언 및 'V'로 초기화
        char ch4 = 'A'; // 문자형 변수 ch4 선언 및 'A'로 초기화
        System.out.println("ch1 = " + ch1); // 변수 ch1 출력
        System.out.println("ch2 = " + ch2); // 변수 ch2 출력
        System.out.println("ch3 = " + ch3); // 변수 ch3 출력
        System.out.println("ch4 = " + ch4); // 변수 ch4 출력
        System.out.println("ch1 + ch2 + ch3 + ch4 = " + ch1 + ch2 + ch3 + ch4); // 변수 ch1, ch2, ch3, ch4의 값을 문자열로 연결하여 출력
        System.out.println("ch1 + ch2 + ch3 + ch4 = " + (ch1 + ch2 + ch3 + ch4)); // 변수 ch1, ch2, ch3, ch4의 ASCII 값을 더하여 출력
    }
}
