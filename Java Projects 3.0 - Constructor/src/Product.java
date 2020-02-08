
public class Product {

    private int id;
    private int price;
    private String name;
    private String code;

    public Product() {

    }

    public Product(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
       
    }

    

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    

}
