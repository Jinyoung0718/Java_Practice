package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class person: 사람;
        // class Student extends Person : 학생 (학생은 사람이다. Strudent is a person)
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)
        // 부모와 자식 클래스 사이에 IS-A 관계가 있다

//        Camera camera = new Camera();
//        FactoryCam factoryCam = new FactoryCam();
//        SpeedCam speedCam = new SpeedCam();

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        // 부모 클래스는 상속하는 자식 클래스 객체를 만들 수도 있다.

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
        
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam :
                cameras) {
            cam.showMainFeature();
        }

        // Factory.detecFire(); -> X
        // speedCam.checkSpeed(); -> X
        // speedCam.recongnizeLicensePlate(); -> X

        // -> Camera 즉 부모 클래스로 부터 만들어진 객체는 부모 클래스에 정의 되지 않은 메서드는 사용 불가능 하다

        if (camera instanceof Camera) {
            System.out.println("카메라입니다");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam) factoryCam).detectFire();
        }

        // 부모클래스로부터 만들어진 객체는 부모클래스에 정의되지 않는 메서드는 사용 불가능하지만
        // 위, 아래와 같이 형변환을 통하여서 사용할 수 있으며 단축키로 쉽게 구현 가능하다

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

    }
}
