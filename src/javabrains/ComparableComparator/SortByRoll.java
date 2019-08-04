package javabrains.ComparableComparator;


import java.util.Comparator;

class SortByRoll implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollno - o2.rollno; // the higher the rollno, the higher the position
    }
}