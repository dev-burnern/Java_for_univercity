package Chap03;

public class Example07 {
    public static void main(String[] args) {
        double d = 3.14; // 변수 d 선언 및 3.14로 초기화
        long l = (long) d; // double d를 long l로 형변환 큰 거에서 작은 형으로 변환하려면 명시해야함
        int i = (int) l; // long l을 int i로 형변환

        System.out.println(d);
        System.out.println(l);
        System.out.println(i);
    }
}
