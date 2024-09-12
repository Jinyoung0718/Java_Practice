package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class  FactoryCam extends Camera implements Detectable, Reportable {

    private Detectable dectecr;
    private   Reportable reporter;
    // 객체를 인스턴스 변수로 설정해 둠
    // Dectectable 인터페이스를 구현한 클래스의 객체를 저장할 변수
    // Reportable 인터페이스를 구현한 클래스의 객체를 저장할 변수

    public void setDectecr(Detectable dectecr) {
        this.dectecr = dectecr;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        dectecr.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }



}
