package lab2;
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
        
        Employee employee2 = (Employee) el.getEmployee(2);
        System.out.println(employee2.toString());
        
        for(int i = 0; i < el.getEmployeeList().size(); i++)
            System.out.println(el.getEmployeeList().get(i));
    }
    
}
