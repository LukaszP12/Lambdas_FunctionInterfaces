import java.util.stream.IntStream;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        MyLambda myLambdaFunction = () -> System.out.println("Hello World");
        MyAdd addFunction = (int a, int b) -> a + b;

        Greeting lambdaGreeting = () -> System.out.println("Hello World");

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World");
            }
        };

        innerClassGreeting.perform();

        System.out.println(addFunction.add(2,4));

        MySubstraction mySubstractionFunction = (int a, int b) -> a - b;

        System.out.println(mySubstractionFunction.substract(8,2));

        powerOfTwo Two = (int x) -> x*x;
        System.out.println(Two.powerTwo(8));

    }

    interface MyLambda {
        void foo();
    }

    interface MyAdd{
        int add(int x, int y);
    }

    interface MySubstraction{
        int substract(int x, int y);
    }

    interface powerOfTwo{
        int powerTwo(int x);
    }

}
