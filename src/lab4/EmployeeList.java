/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lab1.Employee;

/**
 *
 * @author Alex
 */
public class EmployeeList {
        private List<Employee> employeeList;
        private List<EmployeeList> newEmployeeList;
    
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
    
    public void removeDupes(  ){
        Set<EmployeeList> employeeSet = new HashSet( employeeList );
        newEmployeeList = new ArrayList<>(employeeSet);
    }
    
    public List<EmployeeList> getNewEmployeeList(){
        return newEmployeeList;
    }
}
