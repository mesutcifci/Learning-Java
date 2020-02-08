
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Delete();
        customerManager.Update();
        
        CustomerManager customerManager2;
        CustomerManager customerManager3 = new CustomerManager();
        customerManager2 = customerManager3;
        
        customerManager2.Add();
        customerManager2.Delete();
        customerManager2.Update();
        
         
    }
}
