
package VehicleManagementSystem;


public class VehicleManagementSystemMain 
{
    public static void main(String[] args)
    {
        Car cr = new Car("Toyota",2022,5);
        cr.display();
        
        MotorCycle mc = new MotorCycle("Yamaha",2020,"Sports");
        mc.display();
    }
}
