
package lab2;

import java.util.*;
import lab1.Employee;

/**
 *
 * @author Alex
 */
public class EmployeeList {
    
    
    private List employeeList;
    
    public EmployeeList(){
        employeeList = new ArrayList();
    }
    
    public void addEmployee( String firstName , String lastName , String ssn ){
        Employee employee = new Employee( firstName , lastName , ssn );
        employeeList.add(employee);
    }
    
    public Object getEmployee( int index ){
        return employeeList.get(index);
    }

    public List getEmployeeList() {
        return employeeList;
    }
    
    
    
    
}
