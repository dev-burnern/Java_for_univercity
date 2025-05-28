package Chap12;

import java.io.File;
import java.io.FileWriter;

public class Example03 {
    public static void main(String[] args) {
        try {
            File file = new File("example03.txt");
            if(!file.exists())
                file.createNewFile(); // 파일이 존재하지 않으면 새로 생성
            FileWriter myWriter = new FileWriter(file); // FileWriter 객체 생성

            myWriter.write("Hello!!\n"); // 파일에 문자열 쓰기
            myWriter.write("Java Programming\n"); // 파일에 문자열 쓰기
            myWriter.close(); // FileWriter 닫기
            System.out.println("파일에 문자열을 성공적으로 작성했습니다.");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
