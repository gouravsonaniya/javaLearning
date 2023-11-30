package Loop;
import java.util.*;
public class Factorial {

    public static double factorial(int number){
 
        double  factorial = 1;
        for(int i=1; i <= number; i++){
            factorial *= i;
        }

         System.out.println("Factorial of the number is : " + factorial);

        return  factorial;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        factorial(number);


       }
}
