package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    // thread.join() : 대기하는 것으로, 앞선 쓰레드에 join이 있을 시, 이 쓰레드가 끝나고 다음 쓰레드가 실행되도록 한다.
    //                 하지만 () 안에 숫자 기입시 ex) 2500 -> 2.5초 그 숫자 만큼 대기를 하다가 쓰레드가 끝나지 않으면 다음 쓰레드와 같이 병행하여 런타임을 실행한다
    // thread.sleep() : sleep은 ()에 숫자 기입시 그 숫자 단위로 쓰레드가 실행이 된다
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            thread.join(2500); // 2.5초 대기, alt + enter 시 try catch 구문 구현 가능
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i +=2) {
            System.out.println("(사장)" + i + "방 청소 중");
            try {
                Thread.sleep(1000); // 1초 동안 멈추면서 쓰레드르 실행시킴
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 사장 청소 끝 -- ");
    }
}
