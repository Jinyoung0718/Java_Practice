package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자

        // \n 은 줄바꿈을 의미한다
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요");

        // \t는 텝 효과를 준다 -> 줄 간격을 맞춰주는 효과
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        //System.out.println("C:\Program Files \Java");
        // 위의 주석처럼 역스래시(\)를 입력시 이스케이프 문자로 인식되어서 오류가 난다
        // 그래서 역슬래시를 표기하고 싶을 때는 \\ 이와 같이 2번 쓴다
        System.out.println("C:\\Program Files\\Java");

        // 단비가 "냐옹" 이라고 했어요
        // 문자열 사이에 큰 따음표를 넣고 싶을 땐 \"를 쓰면 큰 따움표 효과를 지닌다
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        // \' = 작은 따음표
        char c = 'A';
        c = '\''; // 작은 따음표를 char의 변수로 삼을 때 쓰인다.
    }
}
