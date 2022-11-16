package EveryDayCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class EmployeeCompareDriver {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Abhishek", "D1", 1000L));
        employeeList.add(new Employee("Gopi", "D1", 400L));
        employeeList.add(new Employee("Nirmal", "D2", 1000L));
        employeeList.add(new Employee("Vikram", "D2", 1000L));

        employeeList.sort(Comparator.comparing(Employee::getName));
        employeeList
                .stream()
                .filter(o -> Objects.equals(o.getDept(), "D1"))
                .filter(o -> o.getSalary() > 500)
                .forEach(o -> System.out.print(o.getName()));
    }
}