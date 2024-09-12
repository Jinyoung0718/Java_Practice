package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("지우");
        c2.ready();

        System.out.println("------------------------------------------");

        CoffeeByName c3 = new CoffeeByName(23);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("--------------------------");
        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);
        // 값을 꺼내서 다른 곳에 저장하려고 하여도, 정해진 형은 Object 이기에 계속 형변환이 필요함
        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        // c4Name = (String) c3.name; // <- 개발 상의 실수 우려됨
        System.out.println("--------------------------");

        // 제네릭스 클래스 사용 public class Coffee <T>

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name; // 형 변환 없이 위에서 <> 안에 형을 지정하였기에 바로 변수에 값을 대입할 수 있다
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("소진영");
        c6.ready();
        String c6Name = c6.name; // <- 따로 형 변환 필요 없음
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("--------------------------");

        // 원하는 형태의 것만 받아내는 제네릭스 클래스 사용 <T extends User> <- User 클래스이거나, 상속을 받은 형태만 받음

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동")); // ㅍ
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈")); // User를 상속하기에 가능
        c8.ready();

        System.out.println("--------------------------");
        orderCoffee("김영철");
        orderCoffee(36);
        orderCoffee("김영철", "라뗴");
        orderCoffee(21, "아메리카노");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    // 제네릭스 T도 오버로딩 하여 매개변수를 늘릴 수 있다.
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}