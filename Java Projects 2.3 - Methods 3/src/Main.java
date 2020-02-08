
public class Main {

    public static int sum (int number1, int number2) {
        return number1  + number2;
    }
    public static String sayHello () {
        return "Hello";
    }
    public static void main(String[] args) {

        sum(10, 20);
        int value = sum(10, 20) + 30;
        System.out.println(value);
        
        sayHello(); 
        
        String helloToJava = sayHello() + " java";
        System.out.println(helloToJava);
                
        
        
        
    }
}
