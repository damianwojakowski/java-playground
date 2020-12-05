package optionals;

import java.util.Optional;

public class Optionals {
    public static void simpleUse() {
        Optional<Object> empty = Optional.empty();

        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        Optional<String> someString = Optional.ofNullable(null);

        System.out.println(someString.isPresent());
        System.out.println(someString.isEmpty());

        String orElse = someString
                .map(String::toUpperCase)
                //.orElse("World");
                .orElseGet(() -> {
                    return "Wold from orElseGet()";
                });

        System.out.println(orElse);
    }

    public static void chainingMethods() {
        Optional<String> someString = Optional.ofNullable(null);

        someString.ifPresentOrElse(System.out::println, () -> System.out.println("No Value Found!"));
    }

    public static void withClasses() {
        Person person = new Person("Damian", "JAMES@gmail.com");

        if (person.getEmail().isPresent()) {
            System.out.println(person.getEmail().get());
        }

        Person person2 = new Person("Damian", null);
        String email = person2
                .getEmail()
                .map(String::toLowerCase)
                .orElse("Email Not Provided");

        System.out.println(email);
    }
}
