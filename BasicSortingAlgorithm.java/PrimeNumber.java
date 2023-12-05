import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2){
          System.out.println("N is Prime");
        } else {
          boolean isPrime = true;
          for(int i=2; i<=Math.sqrt(n); i++){  // for(int i=2; i<=n-1; i++)
              if(n%i == 0){            // n is multiple of i ( i is not equal to 1 or n)      
                isPrime = false;
              } 
          }

          if(isPrime == true){
            System.out.println("n is prime");
          } else{
            System.out.println("n is not prime");
          }
        }


    }
}
