package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스<- int, double을 쓰면 안 되고 wrapper 클래스를 써야한다.
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("------------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // T : Type, K: Key, V: Value, E: Element <- 뭘 써도 상관없지만 파라미터와 스태틱 사이에 쓰이는 문자가 같아야 한다
    private static <T> void  printAnyArray(T[] array) {
        for (T t :
                array) {
            System.out.println(t + " ");
        }
        System.out.println();
    }

    // 아래의 3가지 메서드를 한 가지 메서드로 요약 하였다,모든 타입을 한 번에 받아들였기 때문

    private static void printStringArray(String[] sArray) {
        for (String s :
                sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d :
                dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i :
                iArray) {
            System.out.print(i + " "); // 1,2,3,4,5
        }
        System.out.println();





    }

}
