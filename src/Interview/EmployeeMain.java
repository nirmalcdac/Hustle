package Interview;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Abhishek", "D1", 1000L));
        employeeList.add(new Employee("Gopi", "D1", 1000L));
        employeeList.add(new Employee("Nirmal", "D2", 1000L));
        employeeList.add(new Employee("Vikram", "D2", 1000L));

        employeeList.stream().sorted().forEach(System.out::println);
//        String str  = "abbacdbbea";
//        //out = abcde
//        //out aac
//        str.toCharArray();
//        Char temp = null;
//        for(int i = 0; ; i++){
//            if(temp.equals(str.charAt(i))){
//
//            }
//        }
//
//        int [] intArray = new int[]{1, 2,3, 4,5, 6, 7, 8};
//
//        employeeList.stream().filter(h-> h.dept == "D1").collect(Collectors.toList());
//        Stream.of(employeeList).forEach();
    }
}