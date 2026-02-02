
package EmployeeManagementSystem;

public class EmployeeManagementSystemMain {

    
    public static void main(String[] args) 
    {
        Employee em = new Employee("Alice",50000.0);
        em.display();
        
        Manager mn = new Manager("Bob",80000.0,"IT");
        mn.display();
    }
    
}
