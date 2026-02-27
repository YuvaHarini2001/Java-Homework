
package computerbuilder;

public class ComputerBuilderMain 
{
    public static void main(String[] args) 
    {
        Computer cm = new Computer.ComputerBuilder().setCPU("M2").setRAM("12GB").addGraphics("512GB SSD").addHDD("NVIDIA TDX").build();
        cm.display();
    }
    
}
