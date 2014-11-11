/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lab1.Employee;

/**
 *
 * @author Alex
 */
public class EmployeeList {
    
    private Map<String,Employee> employeeMap;
    
    public EmployeeList(){
        employeeMap = new HashMap<>();
    }
    
    public void addEmployee( String firstName , String lastName , String ssn ){
        lab1.Employee employee = new lab1.Employee( firstName , lastName , ssn );
        employeeMap.put(ssn, employee);
        
    }
    
    public Object getEmployee( String ssn ){
        return employeeMap.get(ssn);
    }
    
    public Object getEmployeeMap(){
        return employeeMap;
    }
    
    public void printFromKeys(){
        Set<String> keys = employeeMap.keySet();
        for (String key : keys ) {
            Employee e = employeeMap.get(key);
            System.out.println(e);
                    }
    }
    
    public void printFromValues(){
     
        Collection<Employee> values = employeeMap.values();
        for (Employee e : values){
            System.out.println(e);
        }
    }
    
    
}
