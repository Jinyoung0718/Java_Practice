package chap_10.converter;

@FunctionalInterface // 함수형 인터페이스는 메서드가 1개만 된다, 그러기에 에노테이션을 설정해두면 2개의 메서드 부터 오류가 발생한다
public interface Convertible {
    void convert(int USD);
}
// 인터페이스 내부의 모든 메서드는 암묵적으로 추상 메서드로 간주