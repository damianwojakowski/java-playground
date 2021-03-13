package functionaprogramming.examples;

import java.util.List;

public class SimpleLoopsAndFiltersWithIntegers {

    public void init() {
        structuredVersusFunctionalTest();
    }

    private void structuredVersusFunctionalTest() {
        List<Integer> numbers = List.of(1, 20, 4, 3, 20, 21, 23, 4);

        System.out.println("*** Print Numbers ***");
        printNumbersStructuredApproach(numbers);
        printNumbersFunctionalApproach(numbers);

        System.out.println("*** Print Even Numbers ***");
        printEvenNumbersStructuredApproach(numbers);
        printEvenNumbersFunctionalApproach(numbers);

        System.out.println("*** Print Odd Numbers ***");
        printOddNumbersFunctionalApproach(numbers);
    }

    private void printOddNumbersFunctionalApproach(List<Integer> numbers) {
        System.out.println("New [Functinal Programming] way:");

        numbers.stream()
                .filter(number -> number % 2 > 0)
                .forEach(System.out::println);
    }

    private void printNumbersStructuredApproach(List<Integer> integers) {
        System.out.println("Old [Structured Programming] way:");

        for (Integer i : integers) {
            System.out.println(i);
        }
    }

    private void printNumbersFunctionalApproach(List<Integer> integers) {
        System.out.println("New [Functinal Programming] way:");

        integers.stream().forEach(System.out::println);
    }

    private void printEvenNumbersStructuredApproach(List<Integer> integers) {
        System.out.println("Old [Structured Programming] way:");
        for (Integer i : integers) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }

    private void printEvenNumbersFunctionalApproach(List<Integer> integers) {
        System.out.println("New [Functinal Programming] way:");

        integers.stream()
//                .filter(FunctionalProgramming::isEven)
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
