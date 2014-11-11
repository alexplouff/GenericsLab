/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import lab1.Employee;

/**
 *
 * @author Alex
 */
public class Run {
    
    public static void main(String[] args) {
        EmployeeList el = new EmployeeList();
    
    el.addEmployee("Alex", "Plouff", "333-33-3333");
    el.addEmployee("Alex", "Plouff", "333-33-3333");
    el.addEmployee("Sean", "Robbi", "777-33-2222");
    el.addEmployee("Andy", "Garuz", "444-33-1111");
    
        System.out.println(el.getEmployeeList()
                        +"\nSize: "+ el.getEmployeeList().size());
        
        
        
        for( Employee e : el.getEmployeeList() )
            System.out.println(e);
        
        el.removeDupes();
        
        System.out.println(el.getNewEmployeeList());
    }
}
