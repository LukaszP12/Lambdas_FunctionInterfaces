package javabrains.InterfaceDemo;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn()); // default methods turnAlarmOn() and turnAlarmOff()
        System.out.println(car.turnAlarmOff()); // from our Vehicle interface are automatically available in the Car class.
        // System.out.println(car.getSpeedInKMH());

        List<String> names = Arrays.asList("Lukas", "Paul", "Peter", "John", "Francis", "Michael", "Kim");

        //names.forEach(name -> System.out.println(name));

        names.forEach(System.out::println); // with method reference

        // any iterable of type Collection - list, set, queue etc. have the same syntax for using forEach
        Set<String> uniqueNames = new HashSet<>(Arrays.asList("Larry","Steve","James"));
        uniqueNames.forEach(System.out::println);

        // for a Queue, which is also a Collection
        Queue<String> namesQueue = new ArrayDeque<>(Arrays.asList("Larry","Steve","James"));
        namesQueue.forEach(System.out::println);

        // We use forEach to iterate over a collection and perform a certain action on each element.
        // The action can be performed is contained in a class that implements the Consumer interface
        // and is passed to forEach as an argument

        // We can instantiate an implementation of the Consumer interface using an anonymous class
        // and then apply it as an argument to the forEach method
        Consumer<String> printConsumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        };
        names.forEach(printConsumer);

        // Iterating over a Map - using Map's forEach
        // Maps are not iterable, but, they do provide their own variant of forEach that accepts a BiConsumer
        //
        // BiConsumer was introduced instead of Consumer in Iterable's forEach so that an action can be
        // performed on both the key and value of a Map simultaneously.

        // a Map having entries
        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Larry");
        namesMap.put(2, "Steve");
        namesMap.put(3, "James");

        // let's iterate over the map using forEach
        namesMap.forEach((key,value) -> System.out.println(key + " " +value) ); //  we've used a BiConsumer for this

        // we can also iterate the EntrySet of a Map using Iterable's forEach.

        System.out.println("This is the entrySet of: " + "namesMap");
        System.out.println(
                namesMap.entrySet()
        );

        // since the entries of a Map are stored in a Set called EntrySet, we can iterate that using a forEach
            namesMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

    }

    // the most typical use of default methods in interface is to incrementally provide additional
    // functionality to a given type without breaking down the implementing classes

}
