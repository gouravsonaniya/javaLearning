package Function;
import java.util.*;
import java.lang.*;

public class FunctionExample {

    public static double average(int a, int b, int c){
        
      return (a+b+c)/3;
    }

    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        } else{
            return false;
        }
    }


    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
        while(palindrome != 0){
           int remainder = palindrome % 10;
           reverse = reverse * 10 + remainder;
          palindrome = palindrome / 10;
        }
        
        if(number == reverse){
            return true;
        }

        return false;
         
    }

    public static int isSum(int n){
     int sum =0;
     while(n != 0){
        int lastDigit = n % 10;
         sum  = sum + lastDigit;
         n = n/10;
     }
     
     return sum;
  }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter a number : ");
        // int sum = sc.nextInt();
        // System.out.println("sum of digit of " +  isSum(sum));

        // System.out.print("Enter first number : ");
        // int x = sc.nextInt();
        // System.out.print("Enter Second number : ");
        // int y =sc.nextInt();
        // System.out.print("Enter third number : ");
        // int z = sc.nextInt();

        // System.out.println("Average of three number is "+ average(x, y, z));
        // System.out.print("enter a number : ");
        int palindrome = sc.nextInt();

         if(isPalindrome(palindrome)) {
             System.out.println("number : " + palindrome + " is palindrome");
         }
         else {
             System.out.println("number : " + palindrome + " is not palindrome");
         }
    
        }
    
}
