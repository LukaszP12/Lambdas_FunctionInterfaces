package javabrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int [] someNumbers = {1,2,3,4};
        int key = 0;

        /* this requires a lot of code
        process(someNumbers, key, (v,k) -> {
            try {
                System.out.println(v / k);
            } catch (ArithmeticException e){
                System.out.println("You cannot divide by zero");
            }
        }); */

        process(someNumbers,key,wrapperLambda((v,k)->System.out.println(v / k)));

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer,Integer> consumer){
        for (int i : someNumbers){
                consumer.accept(i, key);
        }
    }

    // this is a lambda expression that returns a lambda
  /*  private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
        return consumer;
    } */

 /*   private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer) {
        return (a,b) -> System.out.println(a + b);
    } */

 private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
     return (v,k) -> {
        consumer.accept(v, k);
     };
 }

}