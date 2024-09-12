package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {
        Room room = new Room();

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작 --");
                for (int i = 1; i <= 5; i++) {
                    room.clean("직원1");// room이라는 메서드를 반복하는 쓰레드로써, 하단에 위치한 쓰레드도 동일한 메서드에 접속하기에, 병행하여 접속함으로 번호가 꼬이게 됨
                                             // 위 쓰레드가 끝나고 다음 쓰레드가 접속하게 만들기 위하여 room이라는 메서드에 Synchronization을 맨 앞에 붙인다

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        };

        Runnable cleaner2 = () -> {
            System.out.println("-- 직원2 청소 시작 --");
            for (int i = 1; i <= 5; i++) {
                room.clean("직원2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("-- 직원2 청소 끝 --");
        };

        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();
    }
}

       // 스레드가 동시에 clean 메서드에 접근하는 것을 방지한다고 해도, 스레드 스케줄링과 실행 순서는
       // 운영체제와 JVM의 결정에 의해 결정됩니다. 따라서 스레드 1과 스레드 2의 작업이 정확하게 번갈아 가며 실행되는 것은 보장되지 않습니다
