package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
        return getPower(number,2);
    };
    // 오버로딩을 이용하여 메소드 내에서도 또 다른 메소드를 호출 가능하다.

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        };
        return result;
    };

    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 메소드를 호출하여 1개의 값이 있으면 무조건 제곱하는 메소드를 구성

        System.out.println(getPower(3)); // 3 * 3 = 9

        // 2의 2승을 구하기
        System.out.println(getPower(2,2)); // 4

        // 3의 3승을 구하기
        System.out.println(getPower(3,3)); // 27

        // 4의 2승을 구하기
        System.out.println(getPower(4,2)); // 16
    }
}
