package Chap04;

public class Example06 {
    public static void main(String[] args) {
        char grade = 'B'; // 변수 grade 선언 및 초기화

        switch (grade) {
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("좋음");
                break;
            case 'D':
                System.out.println("좀 더 열심히");
                break;
            case 'F':
                System.out.println("불합격");
                break;
            default:
                System.out.println("잘못된 입력입니다."); // grade가 A, B, C, D, F가 아닌 경우 출력
        }
    }
}
