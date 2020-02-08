public class Main {
  public static void main(String[] args) {
   
      int number1 = 10;
      int number2 = 20;
      number2 = number1;
      number1 = 30;
      
      System.out.println(number2); // number2 = 10    
      
      int [] numbers1 = {1,2,3};
      int [] numbers2 = {3,4,5}; // nuumbers2[0] = 3 
      numbers2 = numbers1; //numbers2[0] = 1
      numbers1[0] = 10;
      System.out.println(numbers2[0]); // numbers2[0] = 10
      
              
      
}
  
}
