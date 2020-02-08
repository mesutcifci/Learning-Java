
public class Main {

    public static void main(String[] args) {
        /* 
        CustomerManager customerManager = new CustomerManager();
        customerManager.customerDal = new MySqlCstomerDal();
        customerManager.add();
         */
        
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new OracleCustomerDal());
        
//        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
//        customerManager.add();
        
    }
}
