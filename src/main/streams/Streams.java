package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void init() {
        streamWithRange();
        streamWithSkip();
        streamWithSum();
        streamOfAndFindFirst();
        filterSortArray();
        mapAndAverage();
        streamAList();
    }

    public static void streamWithRange() {
        System.out.println("======================");
        System.out.println("streamWithRange:");
        IntStream
                .range(1, 10)
                .forEach(System.out::println);
    }

    public static void streamWithSkip() {
        System.out.println("======================");
        System.out.println("streamWithSkip:");
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));
    }

    public static void streamWithSum() {
        System.out.println("======================");
        System.out.println("streamWithSum:");
        int sum = IntStream
                .range(1, 10)
                .sum();

        System.out.println(sum);
    }

    public static void streamOfAndFindFirst() {
        System.out.println("======================");
        System.out.println("streamOfAndFindFirst:");
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static void filterSortArray() {
        System.out.println("======================");
        System.out.println("filterSortArray:");
        String[] names = {"Ava", "Aneri", "Alberto", "Damian", "Ela", "Zosia"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("D"))
                .sorted()
                .forEach(System.out::println);
    }

    public static void mapAndAverage() {
        System.out.println("======================");
        System.out.println("mapAndAverage:");

        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
    }

    public static void streamAList() {
        System.out.println("======================");
        System.out.println("streamAList:");

        List<String> people = Arrays.asList("Al", "Anakin", "Damian", "Aga");

        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
    }

}
