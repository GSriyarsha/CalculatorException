import java.util.Scanner;
class MyCalculator {
    /*
    * @author Sriyarsha 
    */
    public static long power(int number, int power) throws Exception{
        if (number < 0 || power < 0){
            throw new Exception ("number or power should not be negative.");
        }
        else if (number == 0 && power == 0){
            throw new Exception ("number and power should not be zero.");
        }
        else{
            return ((long) (Math.pow(number, power)));
        }
    }
    
}

public class CalculatorException {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int number = in .nextInt();
            int power = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(number, power));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
