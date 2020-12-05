package threads.example;

public class ThreadClass1 extends Thread {
    @Override
    public void run() {
        System.out.println("Message from ExampleThread1");
    }

}
