package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for
        // 나코 매장
        System.out.println("어서오세요. 나코입니다");
        // 또다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        // 만약에 인사 법이 바뀌면?
        System.out.println("환영합니다. 나코입니다");
        System.out.println("환영합니다. 나코입니다");
        System.out.println("환영합니다. 나코입니다");
        // 매장 이름이 바뀌면?
        // 나코 -> 코나
        System.out.println("환영합니다. 코나입니다");
        System.out.println("환영합니다. 코나입니다");
        System.out.println("환영합니다. 코나입니다");

        System.out.println("---- 반복문 사용 ----");

        // 반복문 사용 For (조건이 거짓이 될 때 까지 반복문은 돌아간다)
        for (int i = 0; i < 10; i++) { // i가 10이 되면 조건문은 거짓이 되므로 반복문 종료
            System.out.println("안녕하세요 진영입니다" + i);
        }

        // 짝수만 출력 = 0, 2, 4, 6, 8, 10 // fori 단축키 사용시 int i와 중괄호가 자동 설정 됨
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i);
        }

        System.out.println(); // 위 아래가 print이므로 prientln으로 띄어쓰기 역할
        // 홀수만 출력 1, 3, 5, 7, 9
        for (int i = 1; i <=10 ; i+=2) {
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 숫자
        // 5, 4, 3, 2, 1
        for (int i = 5; i > 0; i-=1) { // i가 0이 되면 조건이 만족되지 않으므로 반복문 종료됨
            System.out.print(i);
        }

        System.out.println();

        // 1부터 10까지의 수들의 합
        // 1 + 2 + ... + 10 = 55
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum +=i;
            System.out.println(sum);
        }
    }
}
