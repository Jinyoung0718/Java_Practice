package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // If Else 문을 이용 (여러 조건 혹은 범위)
        int ranking = 1;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용 (명확한 케이스가 있는 경우)
        ranking = 4;
        switch (ranking) {
            case 1: // ranking의 값이 1일 경우
                System.out.println("전액 장학금");
                break; // 1일 때는 switch문을 빠져 나옴
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("장학금 대상 아님");
                break;
            default: // 그 외의 경우 일 때 수행
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // case 2와 3을 통합
        ranking = 2;
        switch (ranking) {
            case 1: // ranking의 값이 1일 경우
                System.out.println("전액 장학금");
                break; // 1일 때는 switch문을 빠져 나옴
            case 2: // break가 없으니 다음 케이스로 넘어감
            case 3: // 결론 적으로 케이스를 통합 가능
                System.out.println("장학금 대상 아님");
                break;
            default: // 그 외의 경우 일 때 수행
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가격을 책정 (1급: 최상, 4급: 최하)
        int grade = 1;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000; // 1등급일 경우가 case1일 텐데, break가 없으니 1000원을 3번 더하게 되어진다.
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }


        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
    }
}
