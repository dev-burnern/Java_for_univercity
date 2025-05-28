package Chap12;

import java.io.File;
import java.io.FileOutputStream;

public class Example02 {
    public static void main(String[] args) {
        String str = "Hello! Java Programming";
        try { // 문자열을 파일에 쓰기 위한 예외 처리 시작
            File file = new File("example02.txt"); // 파일 객체 생성
            if(!file.exists()) // 파일이 존재하지 않으면
                file.createNewFile(); // 새 파일 생성

            FileOutputStream fos = new FileOutputStream(file); // 파일 출력 스트림 생성

            byte[] b = str.getBytes(); // 문자열을 바이트 배열로 변환
            fos.write(b); // 바이트 배열을 파일에 씀
            fos.close(); // 파일 출력 스트림 닫기
            System.out.println("파일 쓰기 성공");
        }
        catch (Exception e) { // 예외 발생 시 처리
            e.getMessage(); // 예외 발생 시 메시지 출력
        }
    }
}
