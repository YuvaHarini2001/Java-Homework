
package studentmanagementsystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class StudentManagementSystemMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Set<Integer> studentId = new HashSet();
        
        Map<Integer,String> studentDetails = new HashMap();
        
        int choice;
        
        do
        {
            System.out.println("*****Menu******");
            System.out.println("Enter your choice:\n1.Add Student\n2.Remove Student\n3.Search Student\n4.Display All Students\n5.Display Total StudentCount\n6.Exit");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the id:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    
                    if(studentId.contains(id))
                    {
                        System.out.println("Id already exist");
                    }
                    else
                    {
                        System.out.println("Enter the student name:");
                        String name = sc.nextLine();
                        
                        studentId.add(id);
                        studentDetails.put(id, name);
                        System.out.println("Students added successfully");
                    }
                    break;
                    
                case 2:
                    System.out.println("Enter the remove id:");
                    int removeId = sc.nextInt();
                    
                    if(studentId.contains(removeId))
                    {
                        studentId.remove(removeId);
                        studentDetails.remove(removeId);
                        System.out.println("Student removed Successfully");
                    }
                    else
                    {
                        System.out.println("Id not exist");
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter the search id:");
                    int searchId = sc.nextInt();
                    
                    if(studentDetails.containsKey(searchId))
                    {
                        System.out.println("Student Name:"+studentDetails.get(searchId));
                    }
                    else
                    {
                        System.out.println("Id not found");
                    }
                    break;
                    
                case 4:
                    
                    if(studentDetails.isEmpty())
                    {
                        System.out.println("List is empty");
                    }
                    else
                    {
                        System.out.println("***Student Details***");
                        
                        for(int Student:studentId)
                        {
                            System.out.println("Id:"+Student+"- Name:"+studentDetails.get(Student));
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("Total Student:"+studentId.size());
                    break;
                    
                case 6:
                    System.out.println("Exit");
                    break;
                    
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(choice!=6);
    }
    
}
