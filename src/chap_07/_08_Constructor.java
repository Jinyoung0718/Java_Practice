package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        // 클래스 내 생성자를 활용하여 위와 같이 각 인스턴스 변수마다 값을 매기는 것이 아닌
        // 매개변수 자체로 값을 넣을 수 있다.

    }
}
