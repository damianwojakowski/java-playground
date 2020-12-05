package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsPlayground {

    public void init() {
        // Lists
            // ArrayList
            // LinkedList
            // Vector
            // stack
        testLists();

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

    private void testLists() {
        // ArrayList
        testArrayLists();

        // LinkedList
        // Vector
        // stack
    }

    /**
     * .add(Collection c)
     * .add(int index, Object element)
     * .clear()
     * .lastIndexOf(Object o)
     * .clone()
     * .toArray()
     * .trimToSize()
     */
    private void testArrayLists() {
        System.out.println("*** CollectionsPlayground");

        System.out.println("Creating list and adding two elements...");
        List<String> someList = new ArrayList<>();
        someList.add("Hello");
        someList.add("World");

        System.out.println("Display list items with .toString(): " + someList.toString());
    }

}
