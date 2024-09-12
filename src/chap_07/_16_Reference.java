package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형: int, float, double, long, boolean, ...
        int[] i = new int[3]; // 값을 설정해주지 않으면 기본 값이 적용
        System.out.println(i[0]); //0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 : String, Camera, FactoryCam, SpeedCam
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        /////////////////////////////////////////////
        System.out.println("--------------------------");
        int a = 10;
        int b = 20;
        b = a; // b에다가 a 값을 집어넣음
        System.out.println(a); //10
        System.out.println(b); // 10
        b = 30;
        System.out.println(a); //10
        System.out.println(b); // 30 <- a, b는 별도로 움직인다

        System.out.println("-------------------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라2
        c2 = c1;  // c2에다가 c1을 대입 즉 c1이 참조하고 있는 내용을 c2도 같이 참조하게 만듦
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라1
        c2.name = "고장난 카메라";
        System.out.println(c1.name); // 고장난 카메라
        System.out.println(c2.name); // 고장난 카메라
        System.out.println("----------------");
        changeName(c2);
        System.out.println(c1.name); // 잘못된 카메라
        System.out.println(c2.name); // 잘못된 카메라

        // c2가 c1이 참조하는 객체를 가리키게 하는 것이며, 두 변수가 동일한 객체를 참조하게 됩니다. 따라서 하나의 변수를 통해 객체를 수정하면 다른 변수를 통해서도 동일한 객체가 수정되는 것
        c2 = null; // 관계를 끊는 법
    }

    public  static  void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
