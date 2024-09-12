package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류 (에러 error, 예외 exception)

        // try 에서 실행한 코드를 입력한 뒤 발생할 에러에 대비하여 catch 구문에 에러명 혹은
        // Exception e(전체 에러를 뜻함)를 기입하여 그에 맞는 텍스트나 대응 사항을 정할 수 있다.
        try {
            // System.out.println(3 / 0);

//            int[] arr = new int[3];
//            arr[5] = 100;

            Object obj = "test";
            System.out.println((int) obj);
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage()); // e.getMessage()
            // -> 오류 메시지 내가 지정한 메시지로도 출력이 가능하나 추후에 배운다
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}