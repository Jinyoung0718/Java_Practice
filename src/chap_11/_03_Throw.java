package chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        // try 문구안에 throw new Exception이란 에러를 작위적으로 만드는 것이다
        // 작위적으로 만듦이란 내가 에러명을 설정할 수도, 그 에러명에 맞는 catch 문 작성을 할 수도 있다
        int age = 17; // 만 17세
        try {
            if (age < 19) {
                // System.out.println("만 19세 미만에게는 판매하지 않습니다.");
                throw new Exception("만 19세 미만에게는 판매하지 않습니다.");
            } else {
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
