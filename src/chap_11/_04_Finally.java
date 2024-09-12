package chap_11;

public class _04_Finally {

    // finally : 대게 catch 에서 오류가 발생하게 될 시 에러가 발생함과 동시에 런타임 오류가 나 런타임을 더이상 진행하지 않게 된다, 하지만 finally는 오류가 발생하여도 끝에 실행되었으면 하는 코드들을 집어넣는 것이다

    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
            // System.out.println("택시에 탑승한다.");
        } catch (Exception e) {
            System.out.println("!! 문제 발생 : " + e.getMessage());
        } finally {
            System.out.println("택시의 문을 닫는다.");
        }

        System.out.println("-------------------");

        try {
            System.out.println(3 / 0);
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
