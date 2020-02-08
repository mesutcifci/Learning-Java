
public class Main {
    public static void main(String[] args) {
        Customer customer = new  Customer();
        Employee employee = new Employee();
        
        customer.firstName = "elif";
        customer.e_mail = "dasdasd@aaaa";
        
        employee.firstName = "minik";
        employee.salary = 5000;
        
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager  employeeManager = new EmployeeManager();
        
        customerManager.Add();
        customerManager.discount();
        employeeManager.List();
        employeeManager.bestEmploye();
        
        
        
    }
}
