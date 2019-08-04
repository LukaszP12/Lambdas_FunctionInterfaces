package javabrains.unit3;

import javabrains.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionsIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Caroll",42),
                new Person("Thomas","Carlyle",51),
                new Person("Charlotte","Bronte",45),
                new Person("Matthew","Arnold",39)
        );

        // these are both external operators - we are writing code iternatively telling to perform (external iterator)
        // size is the actual size
        for (int i = 0 ; i < people.size(); i++){
            System.out.println(people.get(i));
        }

        for(Person p : people) {System.out.println(p);};


        // from Java 8 we have internal iterators, it's put to the run time
        // forEach takes in consumer
        // for each element, we want to execute consumer
        System.out.println("Using lambda forEach");
        //people.forEach(p -> System.out.println(p)); // this is a consumer
          people.forEach(System.out::println); // this makes it possible to have multy threating and parallelizm
    }

}