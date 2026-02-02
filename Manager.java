
package EmployeeManagementSystem;

public class Manager extends Employee
{
    String department;
    
    Manager(String name, double salary, String department)
    {
        super(name,salary);
        this.department = department;
    }
    
    @Override
    void display()
    {
        System.out.println("Employee Name:"+super.name);
        System.out.println("Employee Salary:"+super.salary);
        System.out.println("Department:"+department);
    }
}
