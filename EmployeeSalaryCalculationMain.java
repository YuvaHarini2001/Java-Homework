
package employeesalarycalculation;

import java.util.Scanner;


public class EmployeeSalaryCalculationMain 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Permanent Employee Salary:");
        double salary1 = sc.nextDouble();
        System.out.println("Enter the contract Employee Salary:");
        double salary2 = sc.nextDouble();
        
        PermanentEmployee pe = new PermanentEmployee(salary1);
        ContractEmployee ce = new ContractEmployee(salary2);
        
        pe.start();
        try 
        {
            pe.join();
        } 
        catch (InterruptedException ex)
        {
            System.getLogger(EmployeeSalaryCalculationMain.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        ce.start();
    }
    
}
