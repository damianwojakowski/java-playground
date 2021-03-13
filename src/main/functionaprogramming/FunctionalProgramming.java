package functionaprogramming;

import functionaprogramming.examples.SimpleLoopsAndFiltersWithIntegers;

import java.util.List;

public class FunctionalProgramming {

    public void init() {
        System.out.println("======================");
        System.out.println("Functional Programming");
        System.out.println("======================");

        structuredVersusFunctionalTest();
    }

    private void structuredVersusFunctionalTest() {
        new SimpleLoopsAndFiltersWithIntegers().init();
    }


}
