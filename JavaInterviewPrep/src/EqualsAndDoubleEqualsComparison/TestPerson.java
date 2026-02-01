package EqualsAndDoubleEqualsComparison;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Prathamesh", 25);
        Person person2 = new Person("Prathamesh", 25);

        Person person3 = person1;

        // checking the memory address
        if (person1 == person3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // checking for the object content
        if (person1.equals(person2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        Integer a = 10;
        Integer b = 10;

        if (a.equals(b)) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
