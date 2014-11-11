/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import lab1.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class EmployeeList {
   
    private final List<Employee> employeeList;
    
    public EmployeeList(){
        employeeList = new ArrayList<>();
    }
    
    public void addEmployee( String firstName , String lastName , String ssn ){
        lab1.Employee employee = new lab1.Employee( firstName , lastName , ssn );
        employeeList.add(employee);
    }
    
    public Employee getEmployee( int index ){
        return employeeList.get(index);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
