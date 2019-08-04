import java.util.Arrays;
import java.util.List;

public class insteadOfLoop {

    public static void main(String[] args) {
        String[] a = {"cat", "dog", "mouse", "rat", "pig", "rabbit", "hamster", "parrot"};
        List animals = Arrays.asList(a);

        animals.forEach(System.out::println);
    }



}
