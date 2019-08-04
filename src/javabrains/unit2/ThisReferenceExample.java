package javabrains.unit2;

public class ThisReferenceExample {

    public void doProcess(int i, Process p){
        p.process(i);
    }

    public void execute() {
        // this points to the instance of object, on which the method is being called
        doProcess(10,i -> {
            System.out.println("Values if i is " + i);
            System.out.println(this); //points to the same value as outside the lambda
        });
    }

    interface Process {
        void process(int i);
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new Process() {

            @Override
            public void process(int i){
                System.out.println("Value of i is " + i);
                System.out.println(this);
                // it will print out javabrains.unit2.ThisReferenceExample$1@27973e9b - address of new Process() instance
                // in Java static context you cannot really access the this reference
                // but here we are working in new Process()
            }

            @Override
            public String toString() {
                return "This is the anonymouse inner class";
            }
        });

        // now with lambda expression
        thisReferenceExample.doProcess(10, i ->{
            System.out.println("Value of i is " + i);
            //System.out.println(this); // cannot use in static context

            // in case of anoymouse inner class this referes to the instance
            // however in case of Lambda
            // the value would be the same as of outside lambda expression
            // lambda does not override the 'this' expression
        });

        thisReferenceExample.execute();

    }

    // this reference in Lambda
    // this reference points to the new process instance created in the doProcess

    public String toString() {
        return "This is the main ThisRefenenceExample class instance";
    }

}
