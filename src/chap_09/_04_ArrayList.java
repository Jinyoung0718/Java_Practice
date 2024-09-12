package chap_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List, Set, Map)
        // List는 Arraylist 와 LinkedList로 두가지 종류이다 -> list는 중복을 허용

        // list.add(), list.get(), list.size(), list.remove(), list.clear(), list.set( , ), list.contains()
        // 괄호 안에 인덱스를 써서 활용도 가능하지만 리스트 안 데이터를 형을 그대로 써서도 활용이 가능하다
        // 예시 ) list.remove("박명수"); list.remove(3); or  list.set(0, "이수근"); or list.contains("김종국")
        // 참고로 set은 원하는 위치에 원하는 값을 넣도록 하는 것이며, clear는 전체 삭제 remove는 원하는 값만 삭제



        ArrayList<String> list = new ArrayList<>(); // ArrayList 문법 <> 안에 원하는 타입을 넣는다

        // 데이터 추가
        list.add("박명수");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("소진영");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(4));
        System.out.println("------------------------");

        // 데이터 삭제
        System.out.println("신청 학생 수 (이사 전) : " + list.size()); // size 메소드는 어레이 리스트 안에 있는 데이터 갯수를 세어준다
        list.remove("박명수");
        System.out.println("신청 학생 수 (이사 후) : " + list.size());
        System.out.println(list.get(3));

        System.out.println("------------------------");

        System.out.println("남은 학생 수 (제외 전) : " + list.size()); // 4
        list.remove(list.size() - 1); // 마지막 데이터
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        System.out.println("------------------------");

        // 순회
        for (String s :
                list) {
            System.out.println(s);
        }

        System.out.println("------------------------");

        // 변경

        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0, "이수근");
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println("------------------------");

        // 확인

        System.out.println(list.indexOf("김종국")); // 2

        // 선착순 5명 내에 포함되었는가?
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        }
        else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("------------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("------------------------");

        // 다음 학기에 새로 공부 시작
        list.add("박명수");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("소진영");

        // 정렬
        Collections.sort(list);

        for (String s :
                list) {
            System.out.println(s);
        }

    }
}
