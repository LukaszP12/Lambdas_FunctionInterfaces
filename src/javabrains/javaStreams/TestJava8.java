package javabrains.javaStreams;

import java.awt.desktop.PreferencesEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava8 {

    public static void main(String[] args) {
        List<String> alpha = Arrays.asList("a","b","c","d","e");

        //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for(String s : alpha){
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(alpha);
        System.out.println(alphaUpper);

        // Java 8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n*2).collect(Collectors.toList());
        System.out.println(collect);


        // List of objects -> List of String
        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );

        List<StaffPublic> result = convertToStaffPublic(staff);
        System.out.println(result);

        // before Java 8
     /*   List<String> result = new List<String>();
        for (Staff x :staff){
            result.add(x.getName());
        }
        System.out.println(result);

        // Java8
        List<String> collect2 = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(collect2); */

    }

    private static List<StaffPublic> convertToStaffPublic(List<Staff> staff) {

        List<StaffPublic> result = new ArrayList<>();

        for (Staff temp : staff) {

            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if ("mkyong".equals(temp.getName())) {
                obj.setExtra("this field is for mkyong only!");
            }

            result.add(obj);
        }

        return result;

    }

}