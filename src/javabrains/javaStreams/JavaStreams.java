package javabrains.javaStreams;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) throws IOException {
        // 1. Integer Stream
   /*     IntStream
                .range(1,10)
                .forEach(System.out::println);
        System.out.println(); */

        // 2. Integer Stream with skip
 /*       IntStream
                .range(1,100)
                .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println(); */
        // 3. Integer Stream with sum
/*        System.out.println(
        IntStream
                .range(1,5)
                .sum()); */
        // 4. Stream.of, sorted and findFirsts
/*        Stream.of("Ava","Aneri","Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println); */

        // 5. Stream from Array, sort, filter and print
 /*      String[] names = {"Al","Ankit","Kushal","Brent","Sarika","amanda","Hans","Shivika","Samantha"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);  */

        // 6. average of squares of an int array
  /*      Arrays.stream(new int[] {2,4,6,8,10})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println); */

        // 7. Stream from List, filter and print
/*        List<String> people = Arrays.asList("Al","Ankit","Brent","Sarika","amanda","Hans","Shivika","Samantha");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println); */
        // 8. Stream rows from text file, sort, filter and print
 /*       Stream<String> bands = Files.lines(Paths.get("C:\\Users\\LukaszP\\Downloads\\com.spring.security.sample\\Lambdas_samouczek\\src\\javabrains\\javaStreams\\Bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close(); */

        // 9. Stream rows from text file and save to List
/*        List<String> bands2 = Files.lines(Paths.get("C:\\\\Users\\\\LukaszP\\\\Downloads\\\\com.spring.security.sample\\\\Lambdas_samouczek\\\\src\\\\javabrains\\\\javaStreams\\\\Bands.txt"))
            .filter(x -> x.contains("jit"))
            .collect(Collectors.toList());
        bands2.forEach(x -> System.out.println(x)); */

        // 10. Stream rows from CSV file and count
/*        Stream<String> rows1 = Files.lines(Paths.get("C:\\Users\\LukaszP\\Downloads\\com.spring.security.sample\\Lambdas_samouczek\\src\\javabrains\\javaStreams\\data.txt"));
        int rowCount = (int)rows1
            .map(x ->  x.split(","))
            .filter(x -> x.length == 3)
            .count();
        System.out.println(rowCount + " rows. ");
        rows1.close(); */

        // 11. Stream rows from CSV file, parse data from rows
/*        Stream<String> rows2 = Files.lines(Paths.get("C:\\Users\\LukaszP\\Downloads\\com.spring.security.sample\\Lambdas_samouczek\\src\\javabrains\\javaStreams\\data.txt"));
        rows2  // above it reads the file a lines
            .map(x -> x.split(",")) // we split the words after ','
            .filter(x -> x.length == 3) // filter rows
            .filter(x -> Integer.parseInt(x[1]) > 15) //The item 1. in the array we convert to an int, so from int[] = {12,17,14,23, ,18}
            .forEach(x -> System.out.println(x[0] +  " " + x[1] + " " + x[2]));
        rows2.close(); */

        // 12. Stream rows from CSV file, store fields in HashMap
     /*   Stream<String> rows3 = Files.lines(Paths.get("C:\\\\Users\\\\LukaszP\\\\Downloads\\\\com.spring.security.sample\\\\Lambdas_samouczek\\\\src\\\\javabrains\\\\javaStreams\\\\data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3) // filter rows
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap( // Collectors.toMap has two functions in it
                        x -> x[0], //receives rows array and returns the first element, x[0] becomes the key
                        x -> Integer.parseInt(x[1]))); //parses out the int value of that row
                                        // we've added these two elements to our map for each value
                                // x[1] becomes the value
                rows3.close();
                for (String key : map.keySet()) {
                    System.out.println(key + " " + map.get(key)); */
            // 13. Reduction - sum
   /*         double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);
            System.out.println("Total = " + total); */

            // 14. Reduction - summary statistics
/*             IntSummaryStatistics summary = IntStream.of(7,2,19,88,73,4,10)
                .summaryStatistics();
             System.out.println(summary); */



                }
          }
