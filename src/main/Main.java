import collections.CollectionsPlayground;
import optionals.Optionals;
import streams.Streams;
import threads.Threads;

public class Main {
    public static void main(String[] args) {
//        playWithOptionals();
//        playWithStreams();
//        playWithThreads();
        playWithCollections();
    }

    private static void playWithOptionals() {
        Optionals.simpleUse();
        Optionals.chainingMethods();
        Optionals.withClasses();
    }

    private static void playWithStreams() {
        Streams.init();
    }

    private static void playWithThreads() {
        Threads threads = new Threads();
        threads.init();
    }

    private static void playWithCollections() {
        CollectionsPlayground collectionsPlayground = new CollectionsPlayground();
        collectionsPlayground.init();
    }
}
