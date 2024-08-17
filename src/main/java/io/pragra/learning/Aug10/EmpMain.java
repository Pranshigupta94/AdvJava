package io.pragra.learning.Aug10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpMain {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Pranshi", "G", "112233", "Microsoft", 125000);
        Employee emp2 = new Employee(2, "Ankush", "J", "234567", "Apple", 110000);
        Employee emp3 = new Employee(3, "Bavneet", "S", "345672", "Amazon", 100000);
        Employee emp4 = new Employee(4, "Navjot", "Si", "456789", "Capgemini", 120000);
        Employee emp5 = new Employee(5, "Divyesh", "A", "567890", "Google", 130000);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        System.out.println();

        // Provide the list of employees who have a salary greater than 110000
        List<Employee> highSalaryEmployees = empList.stream()
                .filter(x -> x.getSalary() > 110000)
                .collect(Collectors.toList());

        System.out.println("Employees with salary greater than 110000:");
        highSalaryEmployees.forEach(System.out::println);

        System.out.println();

        // Provide the list of first names of employees who have a salary less than 125000
        List<String> lowSalaryEmployee = empList.stream()
                .filter(x -> x.getSalary() < 125000)
                .map(Employee::getFirstName)
                .collect(Collectors.toList());  //x -> x.getFirstName()
        
        System.out.println("First names of employees with salary less than 125000:");
        lowSalaryEmployee.forEach(System.out::println);

        System.out.println();

        // Provide the map of employees (key should be empId and value should be companyName)
        // for all employees who have a salary less than 115000

        Map<Integer, String> empIdToCompanyMap = empList.stream()
                .filter(x -> x.getSalary() < 115000)
                .collect(Collectors.toMap(Employee::getEmpId, Employee::getCompany));

//        Map<Integer, String> empIdToCompanyMap = empList.stream()
//                .filter(x -> x.getSalary() < 115000)
//                .collect(Collectors.toMap( x -> x.getEmpId(), x -> x.getCompany() ));

                System.out.println("Map of employees with salary less than 115000:");
        empIdToCompanyMap.forEach((key, value) -> System.out.println("empId: " + key + ", company: " + value));

    }
}
