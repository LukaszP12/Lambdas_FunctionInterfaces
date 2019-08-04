import java.util.Arrays;
import java.util.List;

public class streamExample {
    // Strumien reprezentuje sekwencje elementów i pozwala na różne operacje na elementach
    // Operacje te mogą być pośrednie i takie możemy układać w łańcuchy metod, oraz końcowe, zwracające wynik, lub nie.

    public static void main(String[] args) {
        List fruits = Arrays.asList("apple","banana","cherry","plum","pear","pinapple");

        fruits.stream().filter(s -> s.toString().startsWith("p")).map(s -> s.toString().toUpperCase()).sorted().forEach(System.out::println);
    }
}
