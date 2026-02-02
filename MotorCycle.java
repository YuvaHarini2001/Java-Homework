
package VehicleManagementSystem;

public class MotorCycle extends Vehicle
{
    String type;
    
    MotorCycle(String brand,int year,String type)
    {
        super(brand,year);
        this.type = type;
    }
    
    @Override
    void display()
    {
        System.out.println("Bike:");
        System.out.println("Brand:"+super.brand);
        System.out.println("Year:"+super.year);
        System.out.println("Type:"+type);
    }
}
