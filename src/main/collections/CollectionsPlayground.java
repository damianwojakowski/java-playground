package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsPlayground {

    public void init() {
        // Lists
            // ArrayList
        testArrayLists();
            // LinkedList
            // Vector
            // stack

        // Queue
            // Priority Queue
            // Deque
                // ArrayDeque

        // Set
            // HashSet
            // LinkedHashSet
            // SortedSet
                // TreeSet

        // Map
            // HashMap
            // HashTable
            // SortedMap
                // TreeMap


        // INTERFACES:
        // Iterator
            // boolean .hasNext()
            // Object .next()
            // void .remove()
            // ...
        // Iterable (root interface)
            // Iterator<T> .iterator()
        // Collection
            // Boolean .add()
            // Boolean .addAll()
            // void .clear()
            // ...
    }

    private void testArrayLists() {
        System.out.println("*** CollectionsPlayground");

        System.out.println("Creating list and adding two elements...");
        List<String> someList = new ArrayList<>();
        someList.add("Hello");
        someList.add("World");

        System.out.println("Display list items with .toString(): " + someList.toString());
    }

}
