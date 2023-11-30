package Loop;
import java.util.*;
public class EvenOddSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.print("Enter a number : ");
            number = sc.nextInt();
            
            if(number%2 == 0){
                evenSum += number;
            } else{
                oddSum += number;
            }

            System.out.print("do you want to continue ? Press 1 for yes or Press 0 for no ");

            choice = sc.nextInt();

        } while(choice == 1);

        System.out.println("Sum of even number is : " + evenSum);
        System.out.println("Sum of odd number is : " + oddSum);




    }
}
