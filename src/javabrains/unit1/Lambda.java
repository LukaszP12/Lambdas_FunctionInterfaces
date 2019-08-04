package javabrains.unit1;


import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Lambda {

    //FunctionInterface ma tylko jedno metode
    @FunctionalInterface
    public interface Checker<T> {
        boolean check(T object);
    }

    public static void main(String args[]) {

        Checker<Integer> isOddLambda = object -> object % 2 != 0;

        System.out.println(isOddLambda.check(123));
        System.out.println(isOddLambda.check(124));

        Object objectInstance = new Object();
        IntSupplier equalsMethodOnObject = objectInstance::hashCode; // pobieram metodę hashCode z tego obiektu i przypisuje do IntSupplier
        System.out.println(equalsMethodOnObject.getAsInt());

        // kod jest równy
        Object objectInstance1 = new Object();
        System.out.println(objectInstance1.hashCode());

        // odwołanie się do konstruktora
        Supplier<Object> objectCreator = Object::new;
        System.out.println(objectCreator.get());

        // przykład zastosowania wyrażeń lambda i odwołania do metody
        List<Integer> numbers = Arrays.asList(1,2,3,4);

        for (Integer number : numbers){
            System.out.println(number);
        }

        // To samo zadanie można także zrobić przy pomocy wyrażeń lambda:
        List<Integer> numbers1 = Arrays.asList(1,2,3,4);
        Consumer<Integer> integerConsumer = n -> System.out.println(n);
        numbers1.forEach(integerConsumer);

        numbers1.forEach(System.out::println);

    }

    //Interfejsy funkcyjne
    // Function<T, R> zawiera metodę apply, która przyjmuje instancję klasy T zwracjąc instancję klasy R,

    // Consumer<T> zawiera metodę accept, która przyjmuje instancę klasy T,

    // Predicate<T> zawiera metodę test, która przyjmuje instancję klasy T i zwraca flagę. Interfejs ten
    // może posłużyć do zastąpienia interfejsu Checker ,

    // Supplier<T> zawiera metodę get, która nie przyjmuje żadnych paramementrów i zwraca instancję klasy T,

    Supplier<String> someString = () -> "some return value";

    // UnaryOperator<T> jest specyficznym przypadkiem interfejsu Function. W tym przypadku typ argumentu i typ zwracany są te same.

    UnaryOperator<Integer> square = x -> x * x;

    BiConsumer<Integer, Long> multiplier = (Integer x, Long y) -> System.out.println(x * y);

    Function<Integer, Long> multiline = x -> {
        if (x != null && x % 2 == 0) {
            return (long) x * x;
        } else {
            return 123L;
        }
    };


}