/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import lab1.Employee;
/**
 *
 * @author Alex
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    
        EmployeeList el = new EmployeeList();
    
    el.addEmployee("Alex", "Plouff", "333-33-3333");
    el.addEmployee("Dan", "Rogers", "333-33-3333");
    el.addEmployee("Sean", "Robbi", "777-33-2222");
    el.addEmployee("Andy", "Garuz", "444-33-1111");
    
        System.out.println(el.getEmployeeList()
                        +"\nSize: "+ el.getEmployeeList().size());
        
        Employee employee2 = el.getEmployee(2);
        System.out.println(employee2.toString());
        
        for( Employee e : el.getEmployeeList() )
            System.out.println(e);
    }
    
    
}
