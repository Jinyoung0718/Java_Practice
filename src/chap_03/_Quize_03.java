package chap_03;

public class _Quize_03 {
    public static void main(String[] args) {
        String identifyiedID = "901231-1234567";
        System.out.println(identifyiedID.substring(0, identifyiedID.lastIndexOf("2")));

        identifyiedID = "030708-4567890";
        System.out.println(identifyiedID.substring(0, identifyiedID.indexOf("5")));

        System.out.println(identifyiedID.substring(0,identifyiedID.indexOf("-") +2 ));
    }
}
