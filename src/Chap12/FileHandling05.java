package Chap12;

import java.io.File;
import java.io.FileReader;

public class FileHandling05 {
    public static void main(String[] args) {
        File file = new File("member.txt"); // member.txt 파일 객체 생성
        try{
            if (!file.exists())
                file.createNewFile(); // 파일이 존재하지 않으면 새로 생성

            FileReader fr = new FileReader(file);
            int i = 0; // 문자 읽기 위한 변수 i 초기화

            while ((i = fr.read()) != -1) { // 파일에서 문자를 읽어올 때까지 반복
                System.out.print((char)i); // 읽은 문자를 출력
            }
            fr.close(); // 파일 리더 닫기
            System.out.println("\n파일 읽기 완료"); // 파일 읽기 완료 메시지 출력
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
