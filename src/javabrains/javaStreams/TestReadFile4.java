package javabrains.javaStreams;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile4 {

    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\LukaszP\\Downloads\\com.spring.security.sample\\Lambdas_samouczek\\src\\javabrains\\javaStreams\\lines";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IIOException e) {
            e.printStackTrace();
        }
    }
}