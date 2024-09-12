package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
              String s = null;
              System.out.println(s.toLowerCase());
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // 만일 각각의 오류에 같은 대응을 하고 싶다면, | <- 사이를 두고 에러 명을 양 옆으로 두면 된다
            System.out.println("뭔가 실수 하셨네요.");
        //} catch (ArrayIndexOutOfBoundsException e) {
        //    System.out.println("뭔가 실수 하셨네요.");
        } catch (ClassCastException e) {
            System.out.println("잘못된 형 변환입니다.");
        } catch (Exception e) {
            System.out.println("그 외의 모든 에러는 여기서 처리가 돼요.");
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
