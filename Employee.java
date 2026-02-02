
package EmployeeManagementSystem;

public class Employee 
{
    String name;
    double salary;
    
    Employee(String name, double salary)
    {
        this.name= name;
        this.salary = salary;
    }
    
    void display()
    {
        System.out.println("Employee Management System");
        System.out.println("----------------");
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Salary:"+salary);
    }
}
