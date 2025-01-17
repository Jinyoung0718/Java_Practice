package chap_09;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        // ArrayList는 의자가 있을 시, 중간에 앉을려는 경우 그 위치로부터 뒤에 있는 모든 사람이 뒤로 앉아야 하지만
        // LinkedList는 모든 데이터들이 선으로 연결이 되어 있어, 중간에 낄려고 하는 경우 손만 놨다가 다시 잡는 방식처럼 간편하다
        // list.getFirst(), list.getLast(), list.addFirst, list.addLast, list.removeFirst(), list.removeLast()
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("박명수");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("--------------------------");

        // 추가
        list.addFirst("서장훈"); // 맨 처음으로 넣을 수 있다
        for (String s :
                list) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        list.addLast("김희철");
        for (String s :
                list) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        System.out.println("학생 추가 전 : " + list.get(1));
        list.add(1, "김영철");
        System.out.println("학생 추가 후 : " + list.get(1));

        System.out.println("--------------------------");

        // 삭제
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() -1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        System.out.println("--------------------------");

        // 처음 학생과 마지막 학생이 전학
        for (String s :
                list) {
            System.out.println(s);
        }

        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.removeFirst(); // 처음 데이터
        list.removeLast(); // 마지막 데이터
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        for (String s :
                list) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        // 변경 (수강권 양도)
        list.set(0, "이수근");
        System.out.println(list.get(0));

        // 확인
        System.out.println(list.indexOf("김종국"));
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        }
        else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("--------------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("--------------------------");

        // 새로운 학기
        list.add("박명수");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");
        list.add("강호동");
        list.add("강호동"); // 리스트는 중복을 허용

        Collections.sort(list); // 정렬 가나다 순
        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
