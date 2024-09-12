package chap_02;

public class _01_Operater1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2
        System.out.println(2 / 4); // 0
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 사칙연산을 한다
        System.out.println((2 + 2) * 2); // 순서를 내가 정함
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); //30

        c = a - b;
        System.out.println(c); //10

        c = a * b;
        System.out.println(c); //200

        c = a / b;
        System.out.println(c); //2

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); // 1 + 10
        System.out.println(val); // 11
        //++val;  1을 더한 뒤에 변수를 연산함


        val = 10;
        System.out.println(val); //10
        System.out.println(val++); // 10을 출력한 뒤 1을 더함
        System.out.println(val); //11
        //val++;  변수 연산 한 뒤에 1을 더함

        val = 10;
        System.out.println(val); //10
        System.out.println(--val); //9
        System.out.println(val); //9

        val = 10;
        System.out.println(val); //10
        System.out.println(val--); //10
        System.out.println(val); //9

        // 은행 대기번호 표
        int waiting = 0; // 처음 뽑는 사람은 앞에 아무도 없으니 0 즉 뒤에 ++을 붙여야 함
        System.out.println("대기 인원" + waiting++); // 대기인원 : 0
        System.out.println("대기 인원" + waiting++); // 대기인원 : 1
        System.out.println("대기 인원" + waiting++); // 대기인원 : 2

        System.out.println("총 대기인원" + waiting); // 총 대기인원: 3
    }
}
