package chap_11;

import java.io.BufferedWriter;

public class _05_TryWithResources {

    // MyFileWriter 객체를 try 블록에서 생성하고 초기화합니다. 그리고 try 블록이 종료되면 자동으로 close() 메서드가 호출됩니다.

    // MyFileWriter 클래스가 AutoCloseable 인터페이스를 구현하고 있기 때문에 close() 메서드가 자동으로 호출되는 것입니다.
    // Java 7 이후부터는 AutoCloseable 인터페이스를 구현한 객체를 Try-With-Resources 문법을 사용하여 선언하면,
    // 해당 자원은 try 블록이 종료될 때 자동으로 close() 메서드가 호출됩니다. 다른 메서드는 자동으로 실행되지 않습니다..
    // 자동으로 close() 메서드가 호출된다고 하여 그 메서드만 지칭하는 것이 아닌, Try-with-resources는 주로 입출력 관련 리소스를 자동으로 닫는데 사용됩니다.
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close(); // alt + enter 입력하면 손쉽게 try catch 구문이 구현 가능하다.
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("---------------------");

        try (MyFileWriter writer2 = new MyFileWriter()) {
            writer2.write("빵이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용 : " + line);
    }
}