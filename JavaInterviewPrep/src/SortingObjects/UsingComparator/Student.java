package SortingObjects.UsingComparator;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    String studentName;
    int studentAge;

    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.studentAge > o2.studentAge) {
            return 1;
        } else if (o1.studentAge < o2.studentAge) {
            return -1;
        }
        return 0;
    }
}
