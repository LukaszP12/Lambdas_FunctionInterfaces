package javabrains.unit3;

import javabrains.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 2: Create a method that prints all elements in the list
        System.out.println("Printing all people");
        performConditionally(people, p -> true, System.out::println); // p -> method(p)
        // if the methodReferance takes the place of Consumer it means, that there
        // needs to something passed in to that method
    }

    // Predicate returns boolean and Consumer takes something and return nothing
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p : people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }

}