package chap_08;

import chap_07.*; // <- 챕터 7 패키지 내 모든 클래스들을 임포트 하겠다는 뜻

public class _00_AcceessModifierTest {
    public static void main(String[] args) {

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public -> 다른 패키지에서도 가능
//        b1.resolution = "FHD"; // default -> 같은 패키지가 아니므로 불가능
//        b1.price = 200000; // private -> 해당 클래스가 아니므로 불가능
//        b1.color= "블랙"; // protected -> 같은 패키지도 아니고 자식 클래스도 아니므로 불가능
    }
}
