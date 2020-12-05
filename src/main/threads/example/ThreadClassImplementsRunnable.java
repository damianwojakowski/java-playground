package threads.example;

public class ThreadClassImplementsRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from ThreadClassImplementsRunnable");
    }
}
