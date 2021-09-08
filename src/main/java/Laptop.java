public class Laptop {


    public String name;
    public String brand;
    public int storage;
    public float price;
    public boolean touchScreen;



    public Laptop (String name,String brand,int storage,float price, boolean touchScreen)
    {
        this.name = name;
        this.brand = brand;
        this.storage= storage;
        this.price = price;
        this.touchScreen =touchScreen;
    }

    public String getDescription()
    {
        return brand + " " + name + "  with  " +storage + " gb   " ;
    }
}
