package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For
        int max = 20;
        int sold = 0;
        int noShow = 17;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다");

            // 손님이 없다면??
            if (i == noShow) {
                System.out.println(i + " 번 손님, 노쇼로 인해 다음 손님에게 기회를 넘어갑니다");
                continue; // 즉시 밑에 코드는 작동 시키지 않고 다음 회차로 넘어가게 된다
            }

            sold++; // 판매처리,  continue는 이 코드가 먹히지 않으므로 총 20 번에서 노쇼가 제외된 21번 손님까지 나오게 된다
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }
        }
        System.out.println("영업을 종료합니다");
    }
}
