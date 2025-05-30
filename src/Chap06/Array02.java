package Chap06;

public class Array02 {
    public static void main(String[] args) {
        double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7}; // double형 배열 gradeArr 선언 및 초기화
        double sum = 0.0; // 합계를 저장할 변수 sum 초기화

        for (int i = 0; i < gradeArr.length; i++) {
            sum += gradeArr[i]; // 배열의 각 요소값을 sum에 누적
        }

        double avg = sum / gradeArr.length; // 평균 계산
        System.out.println("합계 : " + sum); // 합계 출력
        System.out.format("평균 : %.2f", avg);
    }
}
