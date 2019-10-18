package javabrains.ComparableComparator;
// Arrays.sort works for arrays which can be of primitive data type also.
// Collections.sort works for objects Collections like ArrayList, LinkedList, etc.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort1 {
    public static void main(String[] args) {
        //create an array of string obj
        String domains[] = {"Practice","Geeks","Code","Quiz"};


        // Here we are making a list named as Collist
        List collist = new ArrayList(Arrays.asList(domains));

        // Collection.sort() method is used here
        // to sort the list elements.
        Collections.sort(collist);

        //Let us print the sorted list
        System.out.println("List after the use of " +
                             " Collection.sort() :\n" +
                            collist);

    }
}
