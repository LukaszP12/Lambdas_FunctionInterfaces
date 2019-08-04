package javabrains.unit2;

import javabrains.unit1.Person;
import javabrains.unit1.Unit1ExerciseSolutionJava7;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a method that prints all elements in the list
        System.out.println("Printing all people");
        performConditionally(people, p -> true, p -> System.out.println(p));

        // Step 3: Create a method that prints all people that have last name beginning with C
        System.out.println("Printing all people with last name beginning with C");
        performConditionally(people, person -> person.getLastName().startsWith("C"), p->System.out.println(p));

        System.out.println("Printing all people with first name beginning with C");
        performConditionally(people, person -> person.getFirstName().startsWith("C"), p->System.out.println(p));
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