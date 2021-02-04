package lambda;

interface LambdaInterface {
    void message();
}

public class LambdaDemo {

    public static void init() {
        LambdaDemo lambdaDemo = new LambdaDemo();

        lambdaDemo.lambdaWithAnonymousClass();
        lambdaDemo.lambdaShorterDefinition();
        lambdaDemo.lambdaShortestDefinition();
    }

    private void lambdaShortestDefinition() {
        LambdaInterface lambdaInterface;

        lambdaInterface = () -> System.out.println("Hello");

        lambdaInterface.message();
    }

    private void lambdaShorterDefinition() {
        LambdaInterface lambdaInterface;

        lambdaInterface = () -> {
            System.out.println("Hello");
        };

        lambdaInterface.message();
    }

    private void lambdaWithAnonymousClass() {
        LambdaInterface lambdaInterface;

        lambdaInterface = new LambdaInterface() {
            @Override
            public void message() {
                System.out.println("Hello");
            }
        };

        lambdaInterface.message();
    }


}
