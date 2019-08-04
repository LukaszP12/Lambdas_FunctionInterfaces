package javabrains.ComparableComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    int rollno;
    String name, address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + this.rollno +
                ", name='" + this.name + '\'' +
                ", address='" + this.address + '\'' +
                '}';
    }
}