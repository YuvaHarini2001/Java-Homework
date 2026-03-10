
package employeemanagement;

import java.util.Scanner;


public class EmployeeManagementMain
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        EmployeeDetails employees[] = new EmployeeDetails[100];
        
        int count=0;
        
        int choice;
        
        do
        {
            System.out.println("*****Menu*****");
            System.out.println("Enter your choice:\n1.Add Employee Details\n2.View All Employee Details\n3.Search Employee Details\n4.Exit");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    if(count<100)
                    {
                        System.out.println("Enter the employee id:");
                        int employeeId = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the employee name:");
                        String name = sc.nextLine();
                        System.out.println("Enter the employee department:");
                        String department = sc.nextLine();
                        
                        employees[count]=new EmployeeDetails(employeeId,name,department);
                        count++;
                        
                        System.out.println("Employee Details added Successfully");
                    }
                    else
                    {
                        System.out.println("Storage is Full");
                    }
                    break;
                    
                case 2:
                    for (int i = 0; i <count; i++)
                    {
                        employees[i].display();
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter the search id:");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i <count; i++)
                    {
                        if(employees[i].employeeId==searchId)
                        {
                            employees[i].display();
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Employee Id not found");
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid Choice");
                    break;
                    
            }
        }while(choice!=4);
    }
    
}
