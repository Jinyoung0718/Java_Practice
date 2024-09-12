package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스) -> 객체를 만들 수 없음
        // 추상 메소드 (추상 클래스 또는 인터페이스에서 사용 가능한, 껍데기만 있는 메소드)
        // 추상 메소드는 자식 클래스가 상속 받을 시, 자식 클래스에서 완성을 해야만 한다.

        // Camera camera = new Camera <- 추상 클래스이기에 객체 생성 불가
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }

    public interface Detectable {
        void detect();
    }

}
