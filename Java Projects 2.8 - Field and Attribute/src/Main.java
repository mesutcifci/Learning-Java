
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Laptop";
        product1.price =1500;
        product1.id = 1;
        product1.marka = "Lenovo";
        
        
        Product product2 = new Product();
        product2.name = "Çamaşır Makinası";
        product2.price =700;
        product2.id = 2;
        product2.marka = "beko";
        
      
        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        productManager.add(product1);
      
       
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
}
