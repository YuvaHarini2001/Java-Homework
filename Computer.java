
package computerbuilder;


public class Computer
{
    private final String CPU;
    private final String RAM;
    private final String HDD;
    private final String Graphics;

    private Computer(ComputerBuilder cb) 
    {
        this.CPU = cb.CPU;
        this.RAM = cb.RAM;
        this.HDD = cb.HDD;
        this.Graphics = cb.Graphics;
    }
    
    void display()
    {
        System.out.println("CPU:"+CPU);
        System.out.println("RAM:"+RAM);
        System.out.println("HDD:"+HDD);
        System.out.println("Graphics:"+Graphics);
    }
    
    static class ComputerBuilder
    {
        private String CPU;
        private String RAM;
        private String HDD;
        private String Graphics;

        public ComputerBuilder setCPU(String CPU)
        {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setRAM(String RAM) 
        {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder addHDD(String HDD) 
        {
            this.HDD = HDD;
            return this;
        }

        public ComputerBuilder addGraphics(String Graphics) 
        {
            this.Graphics = Graphics;
            return this;
        }
        
        Computer build()
        {
            return new Computer(this);
        }
    }
}
