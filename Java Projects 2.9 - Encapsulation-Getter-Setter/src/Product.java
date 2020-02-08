
public class Product {

    private int id;
    private String name;
    private String describtion;
    private double price;
    private int stockAnnount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

   
    public double getPrice() {
        return price;
    }

   
    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAnnount() {
        return stockAnnount;
    }

   
    public void setStockAnnount(int stockAnnount) {
        this.stockAnnount = stockAnnount;
    }
}
