package chap_07;

public class _01_Class {
    public static void main(String[] args) {

        // 첫 번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        // 새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";


        // 또 다른 제품을 개발?? -> 코드가 길어짐


        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로부터 bbox라는 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스
        // 클래스는 = 설계도, 라고 생각하고 그 설계도로 만들어진 것이 객체 다른 말로 인스턴스이다

        BlackBox bbox2 = new BlackBox();
    }
}
