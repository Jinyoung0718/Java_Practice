package chap_12.clean;

public class CleanRunnable implements Runnable { //  Runnable 인터페이스를 구현하고 상속도 따로 받을 수 있다, 일반적으로 쓰레드를 바로 상속 받아 버리면 단일 상속이기에 다른 것을 상속받진 못한다,
                                                 // 하지만 Runnable 인터페이스를 구현한 뒤 쓰레드 클래스의 객체 생성 뒤 생성자 위치에 클래스 명을 기입 시
                                                 // Thread thread = new Thread(cleanRunnable); <- thread.start()로 다른 것으로 상속 받으면서 쓰레드를 구현할 수 있다
    @Override
    public void run() {
        System.out.println("-- 직원 청소 시작 (Runnable) -- ");
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("(직원)" + i + "번방 청소 중 (Runnable)");

            try {
                Thread.sleep(1000); // 1초 동안 멈추면서 쓰레드르 실행시킴
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 직원 청소 끝 (Runnable) --");
    }
}
