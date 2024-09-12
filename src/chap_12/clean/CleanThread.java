package chap_12.clean;

public class CleanThread extends Thread { // 쓰레드를 구현하기 위해 상속받음, 하지만 상속은 단일 상속이기에 쓰레드 말고 다른 것을 상속받기 위해서는
                                          // Runnable 인터페이스를 implement를 하고 extends를 하고 싶은 부모 클래스를 지정하면 상속도 받고 쓰레드도 구현 가능하다
    public void run() {
        System.out.println("-- 직원 청소 시작 (Thread) -- ");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(직원)" + i + "번방 청소 중 (Thread)");
        }
        System.out.println("-- 직원 청소 끝 (Thread) --");
    }


}

