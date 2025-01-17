package chap_09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value) -> // 맵 : 중복X, 순서X
        // map.put("유재석",10) : 맵만 put 나머지는 add
        // map.get("유재석"), map.containsKey("서장훈"), map.get("서장훈"), map.keySet(), map.values(),
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("유재석",10);
        map.put("박명수",5);
        map.put("김종국",3);
        map.put("서장훈",15);

        System.out.println("총 고객 수 : " + map.size());
        System.out.println("-------------------------");

        // 조회
        System.out.println("유재석님의 포인트 : " + map.get("유재석"));
        System.out.println("박명수님의 포인트 : " + map.get("박명수"));
        System.out.println("-------------------------");

        // 확인
        if (map.containsKey("서장훈")) {
            int point = map.get("서장훈"); // 서장훈이라는 키의 값을 불러옴
            map.put("서장훈", ++point);
            System.out.println("서장훈님의 누적 포인트 : " + map.get("서장훈"));
        } else {
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록 (포인트 1");
        }
        System.out.println("-------------------------");

        // 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석")); // null
        System.out.println("-------------------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게 접자");
        }
        System.out.println("-------------------------");

        // 다시 고객들이 막 찾아옴
        map.put("유재석",10);
        map.put("박명수",5);
        map.put("김종국",3);
        map.put("서장훈",15);

        // Key 확인 -> map.keySet()
        for (String key :
                map.keySet()) {
            System.out.println(key);
        }
        // map도 set과 마찬가지로 순서가 보장되지 않는다.
        System.out.println("-------------------------");

        // Value 확인 -> map.values()
        for (int value :
                map.values()) {
            System.out.println(value);
        }
        System.out.println("-------------------------");

        // Key/Value 함께 확인
        for (String key :
                map.keySet()) {
            System.out.println("고객 이름: " + key + "\t포인트 : " + map.get(key));
        }
        System.out.println("-------------------------");

        // 맵 : 중복X, 순서X
        map.put("김종국",10);
        map.put("김종국",30);
        map.put("김종국",50); // <- 마지막으로 업데이트 된 마지막 데이터만 출력됨
        for (String key :
                map.keySet()) {
            System.out.println("고객 이름: " + key + "\t포인트 : " + map.get(key));
        }
        System.out.println("-------------------------");

        HashSet<Integer> intset = new LinkedHashSet<>();
        // set과 같이 Linked를 붙이면 순서가 보장된다



    }

}
