
package VehicleManagementSystem;

public class Car extends Vehicle
{
    int seats;
    
    Car(String brand, int year,int seats)
    {
        super(brand,year);
        this.seats=seats;
    }
    
    @Override
    void display()
    {
        System.out.println("Vehicle Management System");
        System.out.println("---------------");
        System.out.println("Car:");
        System.out.println("Brand:"+super.brand);
        System.out.println("Year:"+super.year);
        System.out.println("Seats:"+seats);
    }
}
