package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열로 변환
        System.out.println(s.replace(" and", ",")); // " and"를 ","로 변환
        System.out.println(s.substring(7)); // 인덱스 기준 7 부터 출력
        System.out.println(s.substring(s.indexOf("Java"))); // Java의 위치 정보를 찾아 그 위치로부터 출력
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));
        // Java의 위치 정보 부터 .의 위치 까지 출력
        // 주의: substring은 시작위치 부터 마지막 위치를 지정 시, 마지막 위치는 제외하고 직전에서 멈춘다

        // 공백 제거
        s = "                I love Java.    ";
        System.out.println(s.trim()); // 앞 뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "python";
        System.out.println(s1 + s2); // Javapython
        System.out.println(s1 + "," + s2); // Java,python
        System.out.println(s1.concat(",").concat(s2)); // Java,python
    }
}



