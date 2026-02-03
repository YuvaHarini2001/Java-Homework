
package Abstract;


public class Square extends Shape
{
    double area;

    Square(double member) 
    {
        super(member);
    }
    
    @Override
    void calculateArea()
    {
       this.area = member*member;
       System.out.println(area);
    }
    
}
