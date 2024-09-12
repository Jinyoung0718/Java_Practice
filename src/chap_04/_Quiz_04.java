package chap_04;

import java.util.Scanner;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10;
        int fee = 4000 * hour;

        boolean small_Car = false;
        boolean disablity_Car = true;

        if (fee >= 30000) {
            fee = 30000;
        }

        if (small_Car||disablity_Car) {
            fee /=2;
        }

        System.out.println("주차요금은" +fee + " 원 입니다");
    }
}

