package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>(); // ArrayList, LinkedList 는 둘 다 자바의 List라는 인터페이스를 구현하는 클래스이기에 앞에 List를 써도 된다.
        list.add("유재석");
        list.add("알 수 없음");
        list.add("김종국");
        list.add("알 수 없음");
        list.add("강호동");
        list.add("알 수 없음");
        list.add("박명수");
        list.add("알 수 없음");
        list.add("조세호");

        for (String s :
                list) {
            System.out.println(s);
        }
        System.out.println("--------------------------");

        Iterator<String> it = list.iterator(); // ctrl + alt + v로 list.iterator(); 이 코드를 손쉽게 자료형으로 변경 가능
        // 처음에는 커서가 list의 맨 위에 잇다, next를 한 번 할 때 마다 한 번씩 내려오게 된다
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("--------------------------");
        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) { // hasnext 다음에 가져올 데이터가 있느냐?
            System.out.println(it.next());
        }
        System.out.println("--------------------------");

        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("알 수 없음")) {
                it.remove(); // 삭제
            }
        }
        System.out.println("--------------------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("--------------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석",10);
        map.put("박명수",5);

        // map.iterator() -> 제공되지 않음, KeySet과 Value만 가능
        Iterator<String> itMapkey = map.keySet().iterator();
        while(itMapkey.hasNext()) {
            System.out.println(itMapkey.next());
        }
        System.out.println("--------------------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println("--------------------------");

        // 키와 벨류 동시에 등장 시키는 법 : map.entrySet().iterator();
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
