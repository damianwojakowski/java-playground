package playground;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Playground {

    public static void init() {
//        sortStringsList();
//        iterateOverString();
//        reverseString();
//        reverseStringWithStringBuilder();
//        reverseStringsInAList();
        sortArrays();

    }

    private static void sortArrays() {
        System.out.println("# SORTING ARRAYS #");
        String[] s = List.of("0.1", "0.30", "2", "10", "100", "200").toArray(new String[6]);

        Arrays.sort(s, 0, 5, (one, two) -> {
            BigDecimal oneBD = new BigDecimal(one);
            BigDecimal twoBD = new BigDecimal(two);
            return oneBD.compareTo(twoBD);
        });

        System.out.println("Values after sorting:");
        Arrays.stream(s).forEach(System.out::println);
    }

    private static void reverseStringsInAList() {
        List<String> stringsList = new ArrayList<>(Arrays.asList("Damian", "Agnieszka", "Julia"));

        stringsList.stream()
                .map(name -> new StringBuilder(name).reverse().toString())
                .forEach(System.out::println);
    }

    private static void reverseStringWithStringBuilder() {
        String name = new String("Damian Wojakowski");

        System.out.println(new StringBuilder(name).reverse().toString());
    }

    private static void reverseString() {
        char[] stringCharArray = new String("Damian Wojakowski").toCharArray();
        char[] reversedString = new char[stringCharArray.length];

        System.out.println(new String(stringCharArray));

        int y = 0;
        for (int i = stringCharArray.length - 1; i >= 0; i--) {
            reversedString[y] = stringCharArray[i];
            y++;
        }

        System.out.println(new String(reversedString));


    }

    private static void iterateOverString() {
        String someText = "Hello World";

        for (char letter : someText.toCharArray()) {
            System.out.println(letter);
        }
    }

    private static void sortStringsList() {
        List<String> stringList = Arrays.asList("String1", "Some other String", "yetAnotherString");

        stringList.stream()
                .filter(name -> name.length() > 8)
                .sorted()
                .forEach(System.out::println);
    }
}
