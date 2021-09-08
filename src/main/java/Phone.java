public class Phone {


    public String name;
    public String brand;
    public int releaseYear;
    public float price;
    private boolean isFaulty;
    
    public Phone (String name,String brand,int releaseYear,float price, boolean isFaulty)
    {
        this.name = name;
        this.brand = brand;
        this.releaseYear= releaseYear;
        this.price = price;
        this.isFaulty =isFaulty;
    }
    
    public String makeCall(){
        return "Calling 12345";
    }

    public void setIsFaulty(boolean faulty)
    {
        isFaulty = faulty;

    }

    public String sellPhone()
    {
        if (isFaulty)
        {
            return "This " + name + " Can not be sold";
        }
        else {
            return name + "has been sold";
        }
    }

    public String getDescription()
    {
            return brand + " " + name + "  Made in " +releaseYear + " and is sold for:   " + price;
    }


}
