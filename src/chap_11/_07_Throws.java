package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메소드에서 해결할게요.");
        }
    }

    public static void writeFile() throws IOException { // 클래스 메서드 옆에 thorws 가 붙은 것을 볼 수 있는데, 이것은 오류 발생시 이 메서드에서 자체 해결하지 않고 메인 메서드로 넘겨버린 다는 뜻이다
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일 쓰기에 실패했어요!!");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결했어요.");
//        }

        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일 쓰기에 실패했어요!!");
    }
}
