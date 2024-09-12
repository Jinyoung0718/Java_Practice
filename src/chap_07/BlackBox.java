package chap_07;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class BlackBox {
    // 위 클래스는 설계도 역할로 객체를 생성하기 위해 만들어졌으니, 메인 메소드는 필요 X

    // 인스턴스 변수
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 번호


    // 클래스 변수
    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음에 0이었다가 ++ 연산을 통해서 값을 증가)
    static  boolean canAutoReport = false; // 자동 신고 기능
    // static 붙은 건, 클래스 변수로 위의 인스턴스 변수와는 달리 값이 정해져 있으며
    // 모든 객체에 공통된 값을 주게 된다, 물론 적용되는 클래스 내부에서 변경이 가능하다 -> BlackBox.canAutoReport = true;
    // 쓰고자 하는 클래스 내부에서 객체로 접근하는 것보단 설계도 클래스 자체로 접근하는 것이 정석이다 -> BlackBox.canAutoReport



/*     생성자는 변수 밑에 코딩한다
    BlackBox() {
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

     생성자도 오버로딩이 가능하다
    BlackBox(String modelName, String resolution, int price, String color) {
        this(); // 기본 생성자 호출
         중요한 부분이다
         this() <- 이것은 이름이 같은 생성자를 호출한 것으로, 위의 생성자는 객체를 만듦과 동시에 시리얼 넘버를 ++ 해주는 역할을 한다
         그러나 그러한 설정에도 불구하고 지금 현 생성자처럼 매개변수를 생성하고 호출할 경우에는 코드가 나뉘어져 있기에 설정을 받아들일 수 없게된다
         그래서 this() <- 위 코드를 사용하면 위의 생성자를 호출하여서 코드를 그대로 이어받음과 동시에 현 생성자 코드 설정을 이어갈 수 있게된다

        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }*/






    // 클래스는 기능을 구현하여 메소드 형태로도 가능
    void autoReport() { // 반환값 X
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }else {
            System.out.println("자동 신고 기능이 지원되지 않습니다");
        }
    }

    void insertMemoryCard(int capacity) { // 반환값 X
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은 " + capacity + "GB 입니다");
    }

    int getVideoFileCount(int type) { // 반환값 O
        if (type == 1) {
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    }

    void record(boolean showDataTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다");
        if (showDataTime) {
            System.out.println("영상에 날씨정보가 표시됩니다");
        } if(showSpeed) { // else if로 할 시 날씨정보가 true일 경우 날씨정보만 보여주기에 if문을 또 썼다
            System.out.println("영상에 속도 정보가 표시됩니다");
        }
        System.out.println("영상은" + min + "분 단위로 기록됩니다");
    };

    // 메서드 오버로딩
    void record() {
        record(true, true, 5);
    }

    // 클래스 메소드 -> 클래스 변수를 바로 가져다 쓸 수 있다
    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000) 로 연결됩니다");
        //modelName = "test"; -> 클래스 메소드 내에선 인스턴스 변수는 수정 불가
        canAutoReport = false; // -> 클래스 메소드 내에선 클래스 변수 수정 가능
    }

    void appendModelName(String modelName) { // not static
        this.modelName += modelName;
        // 파라미터 변수와 인스턴스 변수의 이름이 같기에 코드가 제대로 인식이 안 된다
        // 그러므로 this를 붙여 인스턴스 변수임을 알게 해주면 코드가 제대로 먹히게 된다
    }

    // Getter & Setter
    String getModelName() {
        return modelName; // getter 부분
    }
    void setModelName(String modelName) {
        this.modelName = modelName; // setteer 부분
    };

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution; // 인스턴스 변수인 resolution은 매개변수 resolution 이다
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
