
package onlinelaptopordersystem;

public class LaptopOrder 
{
    private String brand;
    private String ram;
    
    private boolean ssd;
    private boolean graphicsCard;
    private boolean extendedWarranty;
    private boolean msOfficeInstalled;

    private LaptopOrder(LaptopBuilder lb)
    {
        this.brand = lb.brand;
        this.ram = lb.ram;
        this.ssd = lb.ssd;
        this.graphicsCard = lb.graphicsCard;
        this.extendedWarranty = lb.extendedWarranty;
        this.msOfficeInstalled = lb.msOfficeInstalled;
    }
    
    static class LaptopBuilder
    {
        private String brand;
        private String ram;
    
        private boolean ssd;
        private boolean graphicsCard;
        private boolean extendedWarranty;
        private boolean msOfficeInstalled;

        public LaptopBuilder(String brand, String ram, boolean ssd, boolean graphicsCard, boolean extendedWarranty, boolean msOfficeInstalled) 
        {
            this.brand = brand;
            this.ram = ram;
            this.ssd = ssd;
            this.graphicsCard = graphicsCard;
            this.extendedWarranty = extendedWarranty;
            this.msOfficeInstalled = msOfficeInstalled;
        }

        public LaptopBuilder setBrand(String brand) 
        {
            this.brand = brand;
            return this;
        }

        public LaptopBuilder setRam(String ram) 
        {
            this.ram = ram;
            return this;
        }

        public LaptopBuilder addSsd(boolean ssd)
        {
            this.ssd = ssd;
            return this;
        }

        public LaptopBuilder addGraphicsCard(boolean graphicsCard)
        {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public LaptopBuilder addExtendedWarranty(boolean extendedWarranty)
        {
            this.extendedWarranty = extendedWarranty;
            return this;
        }

        public LaptopBuilder addMsOfficeInstalled(boolean msOfficeInstalled)
        {
            this.msOfficeInstalled = msOfficeInstalled;
            return this;
        }
        
        public LaptopOrder build()
        {
            return new LaptopOrder(this);
        }
        
    }
    
    void display()
    {
        System.out.println("***Laptop Details***");
        System.out.println("Laptop Brand:"+brand);
        System.out.println("Laptop Ram:"+ram);
        System.out.println("Laptop SSD:"+ssd);
        System.out.println("Laptop Graphics Card:"+graphicsCard);
        System.out.println("Laptop extended Warranty:"+extendedWarranty);
        System.out.println("Laptop MS Office Installed:"+msOfficeInstalled);
    }
}
