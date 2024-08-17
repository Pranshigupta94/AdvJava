package io.pragra.learning.Aug10;

import lombok.AllArgsConstructor;
import lombok.Data;

//create Employee class: empId,  firstName, lastName, phnNo, company, salary
// create 5 employee objects with salary 120000, 110000, 100000, 125000, 130000
// use empId increments values like 1,2,3,4,5
//add these objects into list : empList
// use stream to process empList
// operation 1 :provide the list of employee who has more than 110000 salary
// operation 2 : provide the list of firstName of employees who has salary less than 125000 (use map)
// operation 3 : provide the map of employees (key should be empId and value should be companyName)
// for all employees who has salary less than 115000
@Data
@AllArgsConstructor

public class Employee {

   private  int empId;
    private String firstName;
    private String lastName;
    private String phnNo;
    private String company;
    private double salary;


}
