package CustomClassAsKeyHashMap;

import java.util.Objects;

public class Employee {
    private final String employeeName;
    private final int employeeAge;

    public Employee(String employeeName, int employeeAge) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeAge == employee.employeeAge && Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, employeeAge);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeAge='" + employeeAge + '\'' +
                '}';
    }
}
