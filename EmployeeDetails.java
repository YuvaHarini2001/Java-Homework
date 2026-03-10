
package employeemanagement;


public class EmployeeDetails
{
    int employeeId;
    String name;
    String department;

    public EmployeeDetails(int employeeId, String name, String department)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }
    
    void display()
    {
        System.out.println("***Employee Details***");
        System.out.println("Employee Id:"+employeeId);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Department:"+department);
    }
}
