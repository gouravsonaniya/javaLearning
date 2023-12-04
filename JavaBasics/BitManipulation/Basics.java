package BitManipulation;

public class Basics {
    public static boolean evenAndOdd(int n){
        if((n&1) == 0){
            return true;
        } else{
            return false;
        }
    }

    public static int modularExp(int a, int n, int x){
        int ans = 1;
        while(n>0){
            if((n&1) != 0){
                ans  = ans*a;
            }
            a = a*a;
             n = n>>1;
        } 
       
        int modular = ans % x;
        return modular;
    }
    public static void main(String[] args) {
    //     //binary AND &
    //   //  System.out.println(5 & 6);
    //     //binary OR |
    //     System.out.println(5 | 6);
    //     //binary XOR ^
    //     System.out.println(5 ^ 6);
    //     //binary 1's Complement
    //     System.out.println(~5);
    //     //binary left shift <<
    //     System.out.println(5<<2);
    //     //binary right shift >>
    //     System.out.println(6>>1);

        //System.out.println(evenAndOdd(5));
        System.out.println(modularExp(3, 5, 4));

    }
    
}
