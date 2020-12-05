package threads;

import threads.example.ThreadClass1;
import threads.example.ThreadClassImplementsRunnable;

public class Threads {

    public void init() {
        startSimpleThread();
        instantiateANewThread();
        instantiateANewThreadImplementingRunnableInterface();
        threadAsAnonymousClass();
        threadAsRunnableLambdaExpressions();
        threadAsRunnableLambdaExpressions_WithReferenceToThread();
        sleepingThreads();
        daemonThreads();
        joiningThreads();
    }

    public void startSimpleThread() {
        System.out.println("Starting a new thread...");
        Thread someThread = new Thread();
        someThread.start();
        System.out.println("Exiting the startSimpleThread...");
    }

    public void instantiateANewThread() {
        ThreadClass1 exampleThread1 = new ThreadClass1();
        exampleThread1.start();
    }

    public void instantiateANewThreadImplementingRunnableInterface() {
        Thread exampleThread1 = new Thread(new ThreadClassImplementsRunnable());
        exampleThread1.start();
    }

    public void threadAsAnonymousClass() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Message from anonymous Runnable");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    public void threadAsRunnableLambdaExpressions() {
        Runnable runnableLambda = () -> {
            System.out.println("Message from Runnable Lambda Expressoins");
        };

        Thread thread = new Thread(runnableLambda);
        thread.start();
    }

    public void threadAsRunnableLambdaExpressions_WithReferenceToThread() {
        Runnable runnableLambda = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "Message from Runnable Lambda Expressoins");
        };

        Thread thread1 = new Thread(runnableLambda, "The Thread 1 Reference: ");
        thread1.start();

        Thread thread2 = new Thread(runnableLambda, "The Thread 2 Reference: ");
        thread2.start();
    }

    public void sleepingThreads() {
        Runnable runnableLambda = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "sleepingThreads");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(threadName + "sleepingThreads Finished...");
        };

        Thread thread1 = new Thread(runnableLambda, "The Thread 1 Reference: ");
        thread1.start();

        Thread thread2 = new Thread(runnableLambda, "The Thread 2 Reference: ");
        thread2.start();
    }

    public void daemonThreads() {
        Runnable runnableLambda = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "it will finish as soon as the main thread finishes...");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // won't wait until then, daemon thread finish as fast as the main thread
            System.out.println(threadName + "it won't bet to this point...");
        };

        Thread thread1 = new Thread(runnableLambda, "Deamon Thread: ");
        thread1.setDaemon(true);
        thread1.start();
    }

    public void joiningThreads() {
        Runnable runnableLambda = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "when using someThread.join() the MAIN thread will wait for *someThread* thread to get finished");

            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(threadName + "joiningThreads Running...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(threadName + "it will finish as soon as the main thread finishes...");
        };

        Thread thread1 = new Thread(runnableLambda, "Joining Threads: ");
        thread1.setDaemon(true);
        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
