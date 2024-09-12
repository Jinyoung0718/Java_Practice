package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum) : 상수들의 묶음
        // 달력: JAN, FEB~
        // 옷 사이즈, OS 종류, 해상도 등등

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.println("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
        }

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        for (Resolution myRss : Resolution.values()) { // values를 쓰면 값 하나하나를 꺼내 씀
            System.out.println(myRss + " : " + myRss.ordinal()); // ordinal은 열거된 순서를 알 수 있게 한다.
        }

        for (Resolution myRss : Resolution.values()) {
            System.out.println(myRss + " : " + myRss.getWidth());
        }
    }
}

enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    private final  int width;

    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}