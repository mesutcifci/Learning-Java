
public class Main {
    public static void main(String[] args) {
        sum(10,20,30);
        System.out.println(sum(10,20,30));
        int [] list = {10,20,30};
        System.out.println(sum2(list));
    }
    public  static int sum(int... numbers) {
            int total = 0;
            for(int number: numbers) {
                total += number;
            }
            return total;
    }
    public static int sum2(int[] numbers) {
        int total = 0;
        for(int number: numbers) {
            total = total + number;
        }
      return total;
    }
}
