package javabrains.unit4;

import javabrains.unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {

    public static void main(String[] args) {
        List<Person> people =  Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Caroll",42),
                new Person("Thomas","Carlyle",51),
                new Person("Charlotte","Bronte",45),
                new Person("Matthew","Arnold",39)
        );
        // stream() returns a sequential stream with this collection as its source
        // if we think of people as a list of object, then we can compare a stream of them as an assembly line
        // a stream has a bunch of methods, which we can call on it
        people.stream()
                .filter(p -> p.getFirstName().startsWith("C")) // a filter takes in a Predicate - it returns a stream consisting of the elements
                // the elements that are true remain inside the stream, the other ones are removed
                // of this stream that match the given predicate
                .forEach(p -> System.out.println(p.getFirstName()));
            // we want to isolate the people, who have the first name, beginning with

        // Stream<Person> stream = people.stream(); however it is easier to do
            long count  = people.stream()  // which can assigns a another local variable, however we also have to case it
                    .filter(p -> p.getLastName().startsWith("C"))
                    .count(); // it counts the number of element of the time of termination

            long count1 = people.stream()
                    .filter(p -> p.getLastName().startsWith("D"))
                    .count();

        System.out.println("The number of records beginning with C" + count);
        System.out.println("The number of records beginning with D" + count1);
    }

    // a stream is a new view of a collection
    // the source of the stream provides the elements on the conveyor belt
    // at the end we have a terminal operation

    // WHY LAMBDAS ?
    // Enables functional programming
    // Readable and concise code
    // Easier-to-use APIs and libraries
    // Enables support for parallel processing

}