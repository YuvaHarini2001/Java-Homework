
package encapsulation;


public class EncapsulationMain
{

   
    public static void main(String[] args)
    {
        Person pr = new Person();
        String name = pr.getName();
        pr.setName("John");
        pr.setAge(21);
        System.out.println(name+" "+pr.getName()+" "+pr.getAge());
        
    }
    
}
