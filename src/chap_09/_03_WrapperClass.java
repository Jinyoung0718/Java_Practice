package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 (Wrapper) 클래스
        // 컬렉션(ArrayList, HashMap 등)과 제네릭스(T)와 같이 객체 형태로만 사용 가능한 경우 래퍼 (Wrapper) 클래스 가 반드시 필요합니다.

        Integer i = 123; // int i = 123;
        Double d = 1.0; // double d =1.0;
        Character c = 'A'; // char c ='A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("--------------------");

        System.out.println(i.intValue());
        System.out.println(d.intValue()); // 형변환 메서드
        System.out.println(c.charValue());

        System.out.println("--------------------");
        String s = i.toString();
        System.out.println(s);
    }
}
