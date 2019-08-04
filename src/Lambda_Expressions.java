import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda_Expressions {

    public static void main(String[] args) {
     /*   List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(G7Countries); */

     // Create a list of square of all distinct numbers
     /*   List<Integer> numbers = Arrays.asList(9,10,3,4,7,3,4);
        List<Integer> distinct = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
        System.out.printf("Original List : %s, Square without duplicates : %s %n",numbers,distinct);  */

     // Calculating maximum, minimum, sum and average of list elements
 /*   List<Integer> primes =  Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    IntSummaryStatistics stats = primes.stream().mapToInt((x)->x).summaryStatistics();
    System.out.println("Highest prime number in List : " + stats.getMax());
    System.out.println("Lowest prime number in List : " + stats.getMin());
    System.out.println("Sum of all prime numbers: " + stats.getSum()); */

    List<Integer> primes = Arrays.asList(new Integer[]{2,3,5,7});
    int factor = 2;
    primes.forEach(element -> {System.out.println(factor*element);});

    }

}
