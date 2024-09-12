package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 쓰레드 : 병렬로 작업을 처리하는데 사용되는 것
        CleanThread cleanThread = new CleanThread();
        // cleanThread.run(); // 직원 청소 <- 이것은 그저 객체의 메서드를 실행한 것에 불과함

        cleanThread.start(); // <- 쓰레드 생성 병렬로 진행 됨

        cleanByBoss(); // 사장청소
    }

//    public static void cleanBySelf() {
//        System.out.println("-- 혼자 청소 시작 --");
//        for (int i = 1; i <= 10; i ++) {
//            System.out.println("(혼자)" + i + "방 청소 중");
//        }
//        System.out.println("-- 혼자 청소 끝 -- ");
//    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i +=2) {
            System.out.println("(사장)" + i + "방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 -- ");
    }
}
