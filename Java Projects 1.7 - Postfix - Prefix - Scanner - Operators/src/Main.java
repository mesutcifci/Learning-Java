
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        int a = 1;
        System.out.println("postfix");
        System.out.println(a++);
        System.out.println(a);
        
        
        
        int b = 1;
        System.out.println("\nprefix");
        System.out.println(++b);
        System.out.println(b);
        
        
        
        
        int remain = 10 % 2;
        System.out.println("\nremain");
        System.out.println(remain);
        
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        System.out.println("input = " + input);
        
        
        
    }
}
