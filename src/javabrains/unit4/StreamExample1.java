package javabrains.unit4;

import javabrains.unit1.Person;

import java.util.Arrays;
import java.util.List;

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
    }

}