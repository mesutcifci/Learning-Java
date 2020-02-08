
public class Main {
    public static void main(String[] args) {
         char grade = 'A';
         
         switch(grade) {
             case 'A':
                 System.out.println("Excellent!");
                 break;
             case 'B':
             case 'C':
                 System.out.println("Good!");
                 break;
             case 'F':
                 System.out.println("You couldn't pass the lesson.");
                 break;
             default:
                 System.out.println("Invalid entry!");
  
         }
         
         
         
         
         
         
    }
}
