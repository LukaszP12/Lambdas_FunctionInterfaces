package javabrains.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// java.util.Collections.sort() method is present in java.util.Collections class.
// It is used to sort the elements present in the specified list of Collection in ascending order/
//
// It works similar to java.util.Arrays.sort() method but it is better then as it
// can sort the elements of Arrays as well as linked list, queue and many more present in it

public class Runner {

    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell",16,800));
        laptops.add(new Laptop("Apple",8, 1200));
        laptops.add(new Laptop("Acer",12,700));

        // we have to specify how we want to sort
        Comparator<Laptop> com = new Comparator<Laptop>()
        {
            public int compare(Laptop l1, Laptop l2)
            {
                if(l1.getPrice() > l2.getPrice())
                    return 1;
                else // if there were equal one, if should return 0
                    return -1;
            }
        };

        Collections.sort(laptops, com);   // we sort based on list of parameters

        for (Laptop l : laptops){
            System.out.println(l);
        }

    }
}