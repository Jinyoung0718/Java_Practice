package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("phthon")); // 대소문자를 구분하기에 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true(내용)
        System.out.println(s1 == s2); // true(참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false

        // ==는 참조된 것을 비교해 보는 것이고 equals() 는 내용이 같은지 비교해보는 것이다
        // 맨 위의 1234는 s1 과 s2의 변수에 각 각 배정받은 것 같지만 실제로는 1234라는 문자열의 메모리를 s1과 s2가 같은 메모리를 공유하는 것이다
        // 즉 1234라는 문자열이 같기에 자바에서 그 메모리를 재활용하여 각 변수에 똑같은 메모리로 배정이 된 것이다.
        // 그리하여 == <- 참조 비교시 true가 나온 것이지만 각각 new String으로 1234메모리를 각 각 따로 배정 받을 시에 결과값은 == <- false가 나오게 된다
    }
}
