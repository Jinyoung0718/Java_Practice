package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m

        while(move + height < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리: " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다");

        System.out.println("---- 반복문 ---- #1");

        // 키가 엄청나게 크다면? // 조건이 거짓이기에 바로 벗어나 반복문을 수행하지 않는다
        move = 0;
        height = 25;

        while(move + height < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리: " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다");

        System.out.println("---- 반복문 ---- #2");

        // Do while 반복문 // 조건이 바로 거짓이 되어도 한 번은 실행시킴
        do {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다");
    }
}
