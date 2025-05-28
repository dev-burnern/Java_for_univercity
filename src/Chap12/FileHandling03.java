package Chap12;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class FileHandling03 {
    public static void main(String[] args) {
        File file = new File("member.txt"); // member.txt 파일 객체 생성

        try {
            if (!file.exists())
                file.createNewFile(); // 파일이 존재하지 않으면 새로 생성

            FileWriter fw = new FileWriter(file); // FileWriter 객체 생성
            Scanner input = new Scanner(System.in); // Scanner 객체 생성

            boolean quit = false; // 종료 여부를 나타내는 변수
            while (!quit) {
                System.out.print("아이디 : ");
                String userID = input.next(); // 아이디 입력받기
                fw.write("아이디 : " + userID + " "); // 아이디 입력받아 파일에 기록
                System.out.print("이름 : ");
                String userName = input.next(); // 이름 입력받기
                fw.write("이름 : " + userName + "\n"); // 이름 입력받아 파일에 기록

                System.out.println("계속 입력하시겠습니까? (y/n)");
                input = new Scanner(System.in);  // 새 Scanner 객체 생성
                String str = input.next(); // 사용자로부터 계속 입력 여부 확인

                if (str.toUpperCase().equals("N"))  // 입력이 'N' 또는 'n'이면
                    quit = true;
            }
            fw.close();
            System.out.println("파일에 저장되었습니다.");
        }catch (Exception e){
            e.getMessage();
        }
    }
}
