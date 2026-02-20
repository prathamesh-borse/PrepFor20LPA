package Practice;

public class Main {
    public static void main(String[] args) {
        SomethingOne somethingOne = new SomethingOne();
        somethingOne.print();

        // Abstract Class Testing
        TestingAbstractClass testingAbstractClass = new TestingAbstractClass() {
            @Override
            void printSomething() {
                System.out.println("I am main class");
            }
        };
        testingAbstractClass.printSomething();

        ExtendingAbstractClass extendingAbstractClass = new ExtendingAbstractClass();
        extendingAbstractClass.printSomething();

        // Immutable Class
        ImmutableClass immutableClass = new ImmutableClass("PB", "124");
        System.out.println(immutableClass);

    }
}
