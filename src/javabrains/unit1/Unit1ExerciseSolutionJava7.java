package javabrains.unit1;

import java.util.*;
import java.util.concurrent.locks.Condition;

public class Unit1ExerciseSolutionJava7 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort List by Last Name
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }

        });

        // Step 2: Create a method that prints all elements in the list
        System.out.println("Printing all persons");
        printAll(people);

        // Step 3: Create a method that prints all people that have last name beginning with C
        printLastNameBeginningWithC(people);

        // the same function, using Condition
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println("Printing all people with first names beginning with C");

        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });

    } // cannot declare function in main function

        private static void printConditionally(List<Person> people, Condition condition) {
            for(Person p : people){
                if (condition.test(p)){
                    System.out.println(p);
                }
            }
        }

        private static void printAll(List<Person> people){
            for (Person p : people) {
                System.out.println(p); // toString works automatically
            }
        }

        // last name beginning with C
        private static void printLastNameBeginningWithC(List<Person> people){
            for(Person p : people){
                if(p.getLastName().startsWith("C")){
                    System.out.println(p);
                }
            }
        }

        interface Condition {
            boolean test(Person p);
        }

}