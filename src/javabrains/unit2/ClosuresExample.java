package javabrains.unit2;

public class ClosuresExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20; //before Java8 final int b = 20; now this variable is considered effectively final
        ClosuresExample.doProcess(a,new Process(){

            @Override
            public void process(int i) {
                //b = 40; // Variable 'b' is accessed from within inner class, needs to be final or effectively final
                System.out.println(i + b);
            }
        });

        // Now with lambda expression
        doProcess(a, (i) -> System.out.println(i + b));
    }


    public static void doProcess(int i, Process p){
        p.process(i);
    }

    interface Process {
        void process(int i);
    }

}
