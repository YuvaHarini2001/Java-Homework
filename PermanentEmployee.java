
package employeesalarycalculation;


public class PermanentEmployee extends Employee
{
    
    public PermanentEmployee(double salary) 
    {
        super(salary);
    }
    
    @Override
    public void run()
    {
        System.out.println("Permanent Employee Salary"+salary+"Calculated");
    }
}
