
package employeesalarycalculation;


public class ContractEmployee extends Employee
{
    
    public ContractEmployee(double salary) 
    {
        super(salary);
    }
    
    @Override
    public void run()
    {
        System.out.println("Contract Employee Salary"+salary+"Calculated");
    }
    
}
