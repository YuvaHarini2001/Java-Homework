
package collectionarraylist;


public class Acer 
{
    String laptopModel;
    String laptopColour;
    boolean rgb_Keyboard;
    String processor;
    int price;

    public Acer(String laptopModel, String laptopColour, boolean rgb_Keyboard, String processor, int price) 
    {
        this.laptopModel = laptopModel;
        this.laptopColour = laptopColour;
        this.rgb_Keyboard = rgb_Keyboard;
        this.processor = processor;
        this.price = price;
    }
    
    void display()
    {
        System.out.println("*****Laptop Details*****");
        System.out.println("Laptop Model Name:"+laptopModel);
        System.out.println("Laptop Colour:"+laptopColour);
        System.out.println("It is rgb_Keyboard:"+rgb_Keyboard);
        System.out.println("Laptop Processor:"+processor);
        System.out.println("Price:"+price);
    }
    
}
