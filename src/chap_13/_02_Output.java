package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        // System.out.format();
        // System.out.printf();
        // 그냥 단축키 souf 사용하자
        // System.out.printf는 형식 지정 문자열과 값을 결합하여 특정 형식으로 출력할 때 사용합니다. 일반적으로 보기 좋은 출력을 원할 때 사용합니다. ->

        // sout를 쓴 것
        //이름 영어 수학 평균
        //강백호 90 80 85.0
        //서태웅 100 100 100.0
        //채치수 95 100 97.5

        // souf를 쓴 것
        //이름      영어   수학   평균
        //강백호      90   80   85.0
        //서태웅     100  100  100.0
        //채치수      95  100   97.5

        // souf -> 정수 : "%d , 실수 : "%f , 문자열: %s
        // 앞에 숫자 기입 시, 그 숫자에 맞는 자릿수를 마련한다, 그리고 원래 숫자는 뒷자리로 옮겨짐, 왼쪽정렬을 원할 시 기입된 숫자 옆에 -를 붙이면 된다
        // 앞에 06과 같이 기입된 숫자 앞에 0을 넣을 시 앞의 빈 공간은 0으로 채움
        // %,15d에서 %와 ,를 함께 사용하면 세 자리마다 쉼표로 숫자를 구분하는 기능을 활성화

        System.out.println("-------- 정수 ------");
        System.out.printf("%d%n", 1); // 1
        System.out.printf("%d %d %d%n", 1, 2, 3); // 1 2 3
        System.out.printf("%d%n", 1234); // 1234
        System.out.printf("%6d%n", 1234); // __1234 (6자리의 공간을 확보하고 나서 1234 출력)
        System.out.printf("%06d%n", 1234); // 001234 (6자리의 공간 확보 후 1234 출력하는데 빈 공간은 0 으로 채움)
        System.out.printf("%6d%n", -1234); // _-1234
        System.out.printf("%+6d%n", 1234); // _+1234 (항상 +- 기호 표시)
        System.out.printf("%,15d%n", 1000000000); // __1,000,000,000 (세자리마다 콤마로 구분)
        System.out.printf("%-6d%n", 1234); // 1234__ (6자리의 공간을 확보하고 나서 왼쪽 정렬 1234 출력)


        System.out.println("-------- 실수 ------");
        System.out.printf("%f%n", Math.PI); // 3.141593 (일반 출력)
        System.out.printf("%.2f%n", Math.PI); // 3.14 (소수점 둘째자리)
        System.out.printf("%6.2f%n", Math.PI); // __3.14 (6자리 공간 확보하고 소수점 둘째자리)
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__ (왼쪽 정렬)
        System.out.printf("%06.2f%n", Math.PI); // 003.14 (빈 공간을 0 으로 채우기)
        System.out.printf("%+6.2f%n", Math.PI); // _+3.14 (항상 +- 기호 표시)

        System.out.println("-------- 문자열 ------");
        System.out.printf("%s%n", "Java"); // Java (일반 출력)
        System.out.printf("%6s%n", "Java"); // __Java (6자리 공간 확보하고 우측 정렬)
        System.out.printf("%-6s%n", "Java"); // Java__ (6자리 공간 확보하고 좌측 정렬)
        System.out.printf("%6.2s%n", "Java"); // ____Ja (6자리 공간 확보하고 우측 정렬해서 2글자 출력)
        System.out.printf("%-6.2s%n", "Java"); // Ja____ (6자리 공간 확보하고 좌측 정렬해서 2글자 출력)

        System.out.println("-------- 응용1 ------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0); // 강백호 90 80 85.0
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0); // 서태웅 100 100 100.0
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5); // 채치수 95 100 97.5

        System.out.println("-------- 응용2 ------");
        System.out.println("이름      영어   수학   평균"); // 공백이 각각 6, 3, 3 칸으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수", 95, 100, 97.5);

        System.out.println("-------- 참고 ------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");
    }
}
