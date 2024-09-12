package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        // 함수 인터페이스 : 메서드를 인터페이스를 구현한 객체에 저장하는 방식

        KRWConverter converter = new KRWConverter();
        // converter.convert(2);

        convertUSD(converter, 1); // 아래의 메서드를 작동시키는 코드, 하지만 아래의 메서드는 인터페이스를 구현한 클래스의 객체를 이용하기에 이렇게 바꿀 수 있다

//        convertUSD(public void convert(int USD) {
//            System.out.println(USD + "달력 = " + (USD * 1400) + " 원");
//        }, 1); -> 이것과도 같다 이걸 람다 표현식으로 줄여보자면

        // 1. 접근 제어자를 없앤다
        // 2. 반환값을 없앤다
        // 3. 변수 명을 없앤다
        // 4. 괄호와 중괄호 사이에 -> 화살표를 넣는다
        // 5. 한 줄일 때는 중괄호도 없앨 수 있고 세미콜론도 없앨 수 있다.

        convertUSD((USD)-> System.out.println(USD + "달력 = " + (USD * 1400) + " 원") , 1);
        // (USD)-> System.out.println(USD + "달력 = " + (USD * 1400) + " 원") <- 이 메서드와 같은 부분은 인터페이스의 객체로 대신하고 있다
        Convertible convertible = (USD)-> System.out.println(USD + "달력 = " + (USD * 1400) + " 원"); // 함수형 인터페이스
        convertUSD(convertible,1); // 그리하여 식을 이렇게 변환이 가능하다.

        // 전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원 ");
        c1.convert();

        // 두 줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달력 = " + (USD * 1400) + " 원");
        };

        c1.convert();

        // 전달값이 2개인 경우?
        ConvertibleWithTwoParams c2 = (USD, KRW) -> {
            System.out.println(USD + "달력 = " + (USD * 1400) + " 원");
        };

        c2.convert(5,1400);

        // 반환값이 있는 경우
//        ConvertibleWithReturn c3 = (USD, KRW) -> {
//            return USD * KRW;
//        };

        // 반환값이 있는 경우 : return이 있는 경우 중괄호를 써야하지만, return을 지우면 중괄호도 지울 수 있다
        ConvertibleWithReturn c3 = (USD, KRW) -> USD * KRW;
        int result = c3.convert(20,1400);
        System.out.println(result);

    }
    public static void convertUSD (Convertible converter,int USD){
        converter.convert(USD);
    }
}

