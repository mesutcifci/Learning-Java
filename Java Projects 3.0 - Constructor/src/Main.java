
public class Main {
    public static void main(String[] args) {
        Product product = new Product(10, 2000, "Laptop");
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCode());
    }
}
