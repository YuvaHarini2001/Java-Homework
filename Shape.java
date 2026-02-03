
package Abstract;


public abstract class Shape
{
   double member;
    
    Shape(double member)
    {
        this.member = member;
    }
    
    abstract void calculateArea();
}
