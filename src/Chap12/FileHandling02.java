package Chap12;

import java.io.File;
import java.io.FileOutputStream;

public class FileHandling02 {
    public static void main(String[] args) {
        File file = new File("gugudan.txt"); // 파일 객체 생성
        try {
            if(!file.exists())
                file.createNewFile(); // 파일이 존재하지 않으면 새로 생성

            FileOutputStream fos = new FileOutputStream(file);
            for(int x = 2; x <= 9; x++) {
                for(int y = 1; y <= 9; y++) {
                    String str = x + " X " + y + " = " + (x * y) + "\n"; // 구구단 문자열 생성
                    byte[] bytes = str.getBytes(); // 문자열을 바이트 배열로 변환
                    fos.write(bytes); // 문자열을 바이트 배열로 변환하여 파일에 기록
                }
            }
            fos.close(); // 파일 출력 스트림 닫기
            System.out.println("구구단이 gugudan.txt 파일에 저장되었습니다."); // 성공 메시지 출력
        }
        catch (Exception e) {
            e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
        }
    }
}
