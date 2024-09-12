package chap_07.camera;

// FactoryCam is Camara. (IS-A)관계
// 부모와 자식 클래스 사이에 IS-A 관계가 있다
public class FactoryCam extends  Camera{ // 자식 클래스
public FactoryCam() {
        super("공장카메라");
    }

    public void recordVideo() {
        super.recordVideo();
        detectFire();
    }


    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다");
    }

    public  void showMainFeature() { // 메서드 오버라이딩
        System.out.println(this.name + " 의 주요 기능 : 화재 감지");
    }


}
