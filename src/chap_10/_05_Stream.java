package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 생성 -> 가공한 걸 재가공 못하기에, 계속 만들어야 됨

        // Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream()
        List<String> langList = new ArrayList<>();
        // langList.add("python");
        // langList.add("java");
        // 위에서처럼 일일히 add 를 할 필요 없고 한 꺼번에 asList() 에 넣고싶은 데이터를 넣고 추가하면 됨
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        // System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        // Stream.of() -> Stream.of()에 괄호를 채우고  ctrl + alt + v 를 하게 되면 스트림 자동 완성 된다
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip , ...
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch, ...

        // 90 점 이상인 점수만 출력, Arrays.stream() 괄호 안에 스트림을 집어넣고 .filter로 조건을 정할 수 있다
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        // Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        // forEach에 연산된 결과가 출력하게 된다.  ::를 사용하여 메서드를 참조하고 있습니다.
        System.out.println("----------------------------");

        // 90 점 이상인 사람의 수 -> .count()
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("----------------------------");

        // 90 점 이상인 점수들의 합 -> sum()
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("----------------------------");

        // 90 점 이상인 점수들을 정렬 -> sorted()
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("----------------------------");

        // "python", "java", "javascript", "c", "c++", "c#"
        // c 로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("----------------------------");

        // java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("----------------------------");

        // 4글자 이하의 언어를 정렬해서 출력 // 이번에는 ArryList를 스트림으로 변환한 뒤 바로 filter를 붙여서 코드를 짜봄
        langList.stream().filter(x-> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("----------------------------");

        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어
        langList.stream().filter(x -> x.length() <= 4).filter(x -> x.contains("c")).forEach(System.out::println);
        System.out.println("----------------------------");

        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어가 하나라도 있는지 여부
        // anyMatch : anyMatch는 하나라도 포함되는지 물어보는 것, allMatch : 전체가 포함되는지 물어보는 것, 괄호안에 x.contain 사용함  => 결과값은 불리언
        boolean anyMatch =  langList.stream().filter(x -> x.length() <= 4).anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("----------------------------");

        // 4글자 이하의 언어들은 모두 c 라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream().filter(x -> x.length() <= 4).allMatch(x -> x.contains("C"));
        System.out.println(allMatch);
        System.out.println("----------------------------");


        // 3글자 이하의 언어들은 모두 c 라는 글자를 포함하는지 여부
        boolean allMatch1 = langList.stream().filter(x -> x.length() <= 3).allMatch(x -> x.contains("C"));
        System.out.println(allMatch);
        System.out.println("----------------------------");

        // 4글자 이하의 언어 중에서 c 라는 글자를 퐇마하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        // map : 데이터를 원하는 형태로 가공하거나, 객체 중에서 내가 꺼내고 싶은 인스턴스 변수를 지정할 수 있는 역할
        langList.stream().filter(x -> x.length() <= 4).filter(x -> x.contains("C")).map(x -> x + "(어려워요").forEach(System.out::println);
        System.out.println("----------------------------");

        // c 라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream().filter(x -> x.contains("c")).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("----------------------------");

        // c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장 -> collect(Collectors.toList())
        //langList.stream().filter(x -> x.contains("c")).map(String::toUpperCase).collect(Collectors.toList()); -> collect에 마우스 대고 ctrl + alt + v 입력시 어레이 리스트 형식 자동 완성된다.
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        langListStartsWithC.stream().forEach(System.out::println);
        // 4글자 이하의 언어 중에서 c를 포함하는 언어를 찾고, "(어려워요)"를 추가하여 출력
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + "(어려워요")
                .forEach(System.out::println);



    }



}
