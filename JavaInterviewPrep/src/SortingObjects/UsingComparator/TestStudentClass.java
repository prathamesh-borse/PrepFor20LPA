package SortingObjects.UsingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStudentClass {
    public static void main(String[] args) {
        Student s1 = new Student("Bhavesh", 52);
        Student s2 = new Student("Swapnil", 28);
        Student s3 = new Student("Prathamesh", 45);
        Student s4 = new Student("Ram", 25);
        Student s5 = new Student("Bhavesh", 52);
        Student s6 = new Student("Bhavesh", 52);
        Student s7 = new Student("Bhavesh", 52);
        Student s8 = new Student("Bhavesh", 52);
        Student s9 = new Student("Bhavesh", 52);
        Student s10 = new Student("Bhavesh", 52);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(s7);
        studentList.add(s8);
        studentList.add(s9);
        studentList.add(s10);

//        System.out.println("Before sorting:");
//        studentList.forEach(System.out::println);

        Collections.sort(studentList, new Student(null, 0));

        Comparator<Student> nameComparator = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.studentName.compareTo(s2.studentName);
            }
        };

//        System.out.println("After sorting:");
//        studentList.forEach(System.out::println);

        Collections.sort(studentList, nameComparator);
//        System.out.println("Name Based sorting:");
//        studentList.forEach(System.out::println);

        List<Student> result = studentList.stream().filter((s) -> s.studentName == "Bhavesh").collect(Collectors.toList());
        System.out.println(result);
    }
}
