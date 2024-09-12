package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phonenumber = "02-1234-5678";
        return phonenumber;
    };

    // 호텔 주소
    public static String getAddress() {
        return "서울시 어딘가";
    }

    // 호텔 엑티비티
    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }


    public static void main(String[] args) {
        // 반환값 //void는 반환값이 없을 때만 쓴다
        String contactNumber = getPhoneNumber(); // return 값을 변수에 담음
        System.out.println("호텔 전화번호 : " + contactNumber);

        String address = getAddress(); // return 값을 변수에 담음
        System.out.println("호텔 주소 : " + address);

        System.out.println("호텔 엑티비티 : " + getActivities()); // 변수에 담지 않고 사용
    }

}
