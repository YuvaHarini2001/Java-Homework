
package genericcalculator;


public class Calculator<T extends Number>
{
    
    public double add(T num1,T num2)
    {
        return num1.intValue()+num2.intValue();
    }
    
    public double sub(T n1,T n2)
    {
        return n1.doubleValue()-n2.doubleValue();
    }
}
