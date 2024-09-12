package chap_10;

// HomeMadeBurger를 상속받아 cook 메소드를 구현하도록 하는 추상 클래스 정의
abstract class HomeMadeBurger {
    public abstract void cook();
}

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        // 엄마가 만든 버거 객체를 가져와서 cook 메소드 호출
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("----------------------------");

        // 동생이 만든 버거 객체를 가져와서 cook 메소드 호출
        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    // 엄마가 만든 버거를 반환하는 메소드
    private static HomeMadeBurger getMomMadeBurger() { // 메소드의 반환 유형은 HomeMadeBurger입니다. 즉, 이 메소드는 HomeMadeBurger 객체를 반환
        return new HomeMadeBurger() { // 익명 내부 클래스를 사용하여 HomeMadeBurger 추상 클래스를 구현
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제 버거");
                System.out.println("재료 : 빵, 소고기패티, 해시브라운, 양상추, 마요네즈, 피클");
            }
        };
    }

    // 동생이 만든 버거를 반환하는 메소드
    public static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() { // 익명 내부 클래스를 사용하여 HomeMadeBurger 추상 클래스를 구현
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨패티, 양배추 샐러드, 딸기잼, 치즈, 삶은 계란");
            }
        };
    }

}
// 추상 클래스 HomeMadeBurger를 정의하고, 이 클래스를 상속받아 구현하는 두 개의 익명 내부 클래스를 사용하여 버거를 생성합니다.
// getMomMadeBurger() 메소드와 getBroMadeBurger() 메소드는 각각 엄마가 만든 버거와 동생이 만든 버거를 생성하고 반환합니다


// 익명 내부 클래스는 클래스를 따로 정의하지 않고도 인터페이스나 추상 클래스를 구현할 수 있으며, 주로 일회성 객체 또는 구현을 재사용할 필요가 없는 경우에 사용됩니다.
