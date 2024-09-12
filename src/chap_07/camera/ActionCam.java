package chap_07.camera;

public final class ActionCam extends Camera { // 상속불가
    public final String lens; // 어디에서도 값 변경 금지됨
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public final void makeVideo() { // final이 붙으면 오버라이딩 불가
        System.out.println(this.name + this.lens + "로 촬영한 영상을 통해 만들어진 멋진 비디오를 제작합니다.");
    };
}
