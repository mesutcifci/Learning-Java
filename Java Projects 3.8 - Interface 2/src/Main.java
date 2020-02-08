
public class Main {

    public static void main(String[] args) {

        IWorkable iWorkable = new Worker();
        iWorkable.work();
        ((Worker)iWorkable).example();
        
        
        
        
        
    }
}
