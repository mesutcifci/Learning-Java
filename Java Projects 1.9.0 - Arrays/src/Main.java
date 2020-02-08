
public class Main {
    public static void main(String[] args) {
       /* 
        String student1 = "Mesut";
        String student2 = "Elif";
        String student3 = "Minik";
        String student4 = "Gırgır";
        
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        */
       
      String [] students = new String[4];
       
       students[0] = "Mesut";
       students[1] = "Elif";
       students[2] = "Minik";
       students[3] = "Gırgır";
      /* 
       for(int i = 0; i < students.length; i++) {
        
           System.out.println(students[i]);
       }
       */
       for(String student:students) {
           System.out.println(student);
       }
       
       
       
        
    }
}
