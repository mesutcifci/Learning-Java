
public class Main {

    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "Laptop";
        product.price = 10;
        productManager.add(product);
        
        
        
    }
}
