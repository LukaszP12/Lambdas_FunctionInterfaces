package javabrains.javaStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestReadFile {

    public static void main(String args[]) {

        String fileName = "C:\\Users\\LukaszP\\Downloads\\com.spring.security.sample\\Lambdas_samouczek\\src\\javabrains\\javaStreams\\lines";
        List<String> list = new ArrayList<>();

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            // stream.forEach(System.out::println);
            list = stream
                    .filter(line -> !line.startsWith("line3"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);

    }
}