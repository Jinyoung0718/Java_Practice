package chap_07;

public class BlackBoxRefurbish { // 클래스도 접근권한을 설정 할 수 있으며 public일 경우 클래스 명과 같아야 한다.
    public String modelName; // 모델명
    String resolution; // 해상도 // 아무것도 안 적으면 default 이다.
    private int price; // 가격
    protected String color; // 색상

    // 인스턴스 변수들을 드래그 한 후 alt + ins 를 누르면 getter&setteer를 바로 만들 수 있는 버튼이 나온다

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

//class A { // 아무것도 안 적었으니 default이다.
//
//}
