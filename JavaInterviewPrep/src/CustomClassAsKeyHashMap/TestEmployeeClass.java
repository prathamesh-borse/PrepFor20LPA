package CustomClassAsKeyHashMap;

import java.util.HashMap;

public class TestEmployeeClass {
    public static void main(String[] args) {
        HashMap<Employee, String> hashMap = new HashMap<>();

        Employee e1 = new Employee("Prathamesh", 25);
        Employee e2 = new Employee("Swapnil", 26);

        hashMap.put(e1, "Infosys");
        hashMap.put(e2, "TCS");

        System.out.println("Return e1 company name: " + hashMap.get(new Employee("Prathamesh", 25)));
        System.out.println("Return e2 company name: " + hashMap.get(new Employee("Swapnil", 26)));
    }
}
