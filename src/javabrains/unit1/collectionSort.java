package javabrains.unit1;

import java.util.Arrays;
import java.util.Comparator;

public class collectionSort {

    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "mouse", "rat", "pig", "rabbit", "hamster", "parrot"};
        // sortowanie zwierząt z kolekcji z użyciem anonimowej klasy wewnętrznej
        Arrays.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        //sortowanie zwierząt z kolekcji z użyciem lambd C
        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(animals, sortByName);

        //albo
        Arrays.sort(animals, (String s1, String s2) -> (s1.compareTo(s2)));
    }

}
