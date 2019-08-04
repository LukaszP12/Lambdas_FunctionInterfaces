package javabrains.unit3;

public class MethodReferenceExample1 {

    public static void main(String[] args) {
        printMessage();

        //Thread t = new Thread(() -> printMessage()); // the lambda is executing a method
        //t.start();

        Thread t = new Thread(MethodReferenceExample1::printMessage);
    }

   public static void printMessage() {
        System.out.println("Hello");
   }



}