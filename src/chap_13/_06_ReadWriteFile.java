package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader : 파일에서 내용을 읽어올 때
        // BufferedWriter : 파일에 내용을 쓸 때
        // FileWriter, FileReader의 객체가 필요하다

        // Try-with-resources는 AutoCloseable 인터페이스를 구현한 클래스뿐만 아니라 Closeable 인터페이스를 구현한 클래스와 함께 사용할 수 있습니다.
        //  BufferedReader와 BufferedWriter 클래스가 Closeable 인터페이스를 구현하고 있으므로 try-with-resources 문을 사용하여 자동으로 이 리소스를 닫을 수 있습니다.


       // 파일 쓰기
      try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
          // 파일 명 뒤에 append를 true로 할 시 write를 쓴 것을 다시 런타임 할 시 그 전에 했던 것에 "더하여" 써지지만
          // 파일 명 뒤에 append를 flase로 할 시 write를 쓴 것을 다시 런타임 할 시 그 전에 했던 것에 "덮어씌여"진다.
            bw.write("1. 이제 거의 끝이 보여요.");
            bw.newLine(); // 줄바꿈
            bw.write("2. 여기까지 오신 여러분들 정말 대단해요!");
            bw.newLine(); // 줄바꿈
          bw.write("3. 조금만 더 힘내요!");
      } catch (IOException e) {
          throw new RuntimeException(e);
      }

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
