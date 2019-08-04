import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

//  basically we are changing everything to lambdas
public class Unit1ExerciseSolutionJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort List by Last Name
        Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a method that prints all elements in the list
        System.out.println("Printing all persons");
        printConditionally(people, p-> true); // it always returns true

        // Step 3: Create a method that prints all people that have last name beginning with C
        printLastNameBeginningWithC(people);

        System.out.println("Printing all people with last name beginning with C");
        printConditionally(people, p -> p.getLastName().startsWith("C"));

        // the same function, using Condition
        /*printConditionally(people, new Unit1ExerciseSolutionJava7.Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });*/

        System.out.println("Printing all people with first names beginning with C");
        printConditionally(people, p -> p.getFirstName().startsWith("C"));

        /*printConditionally(people, new Unit1ExerciseSolutionJava7.Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });*/

    } // cannot declare function in main function

    private static void printConditionally(List<Person> people, Predicate<Person> predicate){
        for(Person p : people){
            if (predicate.test(p)){
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

    // Condition interface is kinda like a predicate
    interface Condition {
        boolean test(Person p);
    }

}
