package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "소진영";
        int hour = 15;

        System.out.println("소진영님, 배송이 시작됩니다. 15시에 방문 예정입니다");
        System.out.println("소진영님, 배송이 완료되었습니다");

        double score = 90.5; // 정밀한 실수 값
        char grade = 'A'; // 한 글자는 char이며 ''로 감싼다
        System.out.println(name + "님의 평균 점수는" + score + "점입니다");
        System.out.println("학점은" + grade + "입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123465789F; // 소수점을 포함하는 실수 값은 기본적으로 double로 인식한다, 그리하여 뒤에 F를 추가하면 정상적으로 인식함, 그리고 double보다 표현할 수 있는 수가 적다
        System.out.println(d);
        System.out.println(f);

        //int i = 10000000000000; int가 가질 수 있는 값을 벗어남
        long l = 1000000000000L; // 이도 기본적으로 int라고 인식하여 뒤에 L을 뒷붙혀 줘야 한다.
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
