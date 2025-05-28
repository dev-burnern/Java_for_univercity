package Chap12;

import java.io.File;
import java.io.FileReader;

public class Example05 {
    public static void main(String[] args) {
        try {
            File file = new File("example03.txt"); // 파일 객체 생성
            if (file.exists())
                file.createNewFile();
            FileReader fr = new FileReader(file);
            int i = 0;
            while ((i = fr.read()) != -1) { // 파일에서 문자 읽기
                System.out.print((char) i); // 읽은 문자를 출력
            }
            fr.close(); // 파일 리더 닫기
            System.out.println("\n파일 읽기 성공");
        }catch (Exception e) { // 예외 발생 시 처리
            System.out.println(e); // 예외 메시지 출력
        }
    }
}
