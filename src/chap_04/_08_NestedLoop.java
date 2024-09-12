package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 사각형 만들기

        /*

        *****
        *****
        *****
        *****
        *****

         */
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("---------");

        // 별 (*) 왼쪽 삼각형 만들기

        /*

        *
        **
        ***
        ****
        *****

         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) { // for 반복문 내에서 유동적인 변수는 i이므로 i를 이용하여 유동적인 코드를 구현가능 하다
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------");

        // 별 (*) 오른쪽 삼각형 만들기

        /*

            *
           **
          ***
         ****
        *****

        */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) { // 실제로 j값이 오르는 게 아니라 조건문 내에서 0부터 숫자가 오르는 것, int 붙인 것 자체가 "선언"
                System.out.print(" "); // for 조건문이 만족할 때 까지 찍어내는 것 그 후 큰 for로 인하여 계속 찍어냄
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

