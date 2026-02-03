
package Abstract;


public class Circle extends Shape
{
    double area;

    Circle(double member) 
    {
        super(member);
    }
    
    @Override
    void calculateArea()
    {
        this.area = 3.14*member*member;
        System.out.println("Area of Circle:"+area);
    }
}
