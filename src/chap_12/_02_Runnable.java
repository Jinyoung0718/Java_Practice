package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable); // 생성자 위치에 cleanRunnable 삽입
        thread.start();

        cleanByBoss();
    }


    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i +=2) {
            System.out.println("(사장)" + i + "방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 -- ");
    }
}
