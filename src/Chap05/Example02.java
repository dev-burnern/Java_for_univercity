package Chap05;

public class Example02 {
    public static String greeting(){
        return "Hi"; // "Hi"라는 문자열을 반환하는 메소드
    }

    public static void main(String[] args) {
        String str = greeting(); // greeting 메소드를 호출하여 반환된 값을 str 변수에 저장
        System.out.println(str + " Java");
    }
}
