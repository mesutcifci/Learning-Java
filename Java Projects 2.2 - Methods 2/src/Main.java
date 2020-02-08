
public class Main {
    public static  void add() {
        System.out.println("added");
    }
   
    public static void delete() {
        System.out.println("deleted");
    }
    public static void sum(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("Total = " + sum);
    }
     public static void sum(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        System.out.println("Total = " + sum);
    }
    
    public static void main(String[] args) {
        
        add();
        delete();
        sum(10, 20);
        sum(10, 20, 30);
            
    }
}
