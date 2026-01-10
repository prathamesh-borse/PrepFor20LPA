package StrongWeakReference;

import java.lang.ref.WeakReference;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person("Prathamesh"); // strong reference
        System.out.println(p.name);


        WeakReference<Person> ref = new WeakReference<>(p);
        p = null; // removes strong reference
        System.gc(); // cleaned up the memory
        Person weakReference = ref.get();
        System.out.println(weakReference.name); // gives error person p will be null here
    }
}
