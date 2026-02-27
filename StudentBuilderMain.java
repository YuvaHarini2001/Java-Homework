
package studentbuilder;


public class StudentBuilderMain
{
    public static void main(String[] args) 
    {
        Student st = new Student.StudentBuilder().setStudentId(101).setStudentName("Yuva Harini").addEmailId("ammuharini2001bpy@gmail.com").addPhone(7200199189l).addAddress("9/1351,Bharathi Nagar,Alagankulam,Ramanathapuram-623512").build();
        st.display();
    }
    
}
