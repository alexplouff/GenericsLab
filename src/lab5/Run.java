/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.awt.RenderingHints.Key;

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
    el.addEmployee("Alex", "Plouff", "333-33-4444");
    el.addEmployee("Sean", "Robbi", "777-33-2222");
    el.addEmployee("Andy", "Garuz", "444-33-1111");
    
    el.printFromValues();
    
        
        
    }
}
