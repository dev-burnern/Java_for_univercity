package Chap05;

public class Method05 {
    public static void calculate(int x, double y){
        System.out.println(2 * x * y); // x와 y의 곱에 2를 곱한 값을 출력
    }

    public static void main(String[] args) {
        int a = 4; // 반지름
        double pi = 3.14; // 원주율
        System.out.println("원의 둘레 구하는 공식 : 2 x 반지름 x 원주율");

        System.out.print("2 x " + a + " x " + pi + " = "); // 출력 형식 지정
        calculate(a, pi); // calculate 메서드 호출
    }
}
