package chap_06;

public class _07_VariableScope {
    // 변수의 범위 -> 선정된 중괄호 범위 내에서만 가능 *주의* 안에서는 재사용 가능 , 하지만 밖으로 나가면 안 됨
//    public static methodA() {
////        System.out.println(number);
////        System.out.println(result);
//        return;
//    };
//
//
//    public static methodB() {
//        int result = 1; // 지역 변수: 변수가 선언 된 영역 내에서만 사용 가능
//        return;
//    };


    public static void main(String[] args) {
        int number = 3; // number를 보면 메인함수 중괄호에 묶여 있다, 이는 메인 함수 내 중괄호 안 쪽에서 선정된 다른 중괄호 안에서도 재활용이 가능하다

        //System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i); // for문 안에서 선언 된 변수는 밖에 못 나온다
        {
            int j = 0;
            System.out.println(j);
            System.out.println(number); // <- 재활용 한 예시
        }
        // System.out.println(j);
    }



}
