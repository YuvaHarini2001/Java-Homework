
package pojo;


public class PojoMain
{

    
    public static void main(String[] args)
    {
        Student st = new Student(3,"Ravi");
        JavaCourse jc = new JavaCourse("Java Course");
        jc.joinCourse(st);
    }
    
}
