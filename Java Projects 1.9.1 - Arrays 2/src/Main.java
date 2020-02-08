
public class Main {
   
    public static void main(String[] args) {
       // String [] a;
       
       /*String a [] = new String[4];
       
       a[3] = "Gırgır";
       
        System.out.println(a[3]);
       */
       
      /* String [] students = {"Mesut","Elif","Minik","Gırgır"};
        
        System.out.println(students[3]);*/
        
        double [] myList = {1.1, 1.3, 2.5 ,6, 7.8  };
        double total = 0;
        double max = myList[3];
        
        for(double number: myList) {
            System.out.println("cuurent number = " + number);
            total += number;
            if (number > max) {
                max = number;
            }
        }
        
        System.out.println("sum of numbers = " + total);
        System.out.println("max number = " + max);
        
        
        
    }
}
