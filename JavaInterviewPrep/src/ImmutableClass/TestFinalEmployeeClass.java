package ImmutableClass;

public class TestFinalEmployeeClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Prathamesh", 25);
        Employee employee1 = employee;

        System.out.println(employee.getName());
        System.out.println(employee1.getName());
    }
}
