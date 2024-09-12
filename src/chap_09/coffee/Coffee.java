package chap_09.coffee;
// 모든 형태의 객체를 받도록 하는 클래스,
// Object도 비슷한 기능을 하지만, 다른 변수에 대입할 때 형 변환이 필요하며,
// 형 변환 시 오류를 발생 시킬 수 있음
public class Coffee <T> {
    public T name;

    public Coffee(T name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
