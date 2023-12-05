package Pattern1;
import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        
       // int line = 4;
    //    *
    //    * *
    //    * **
    //    * ***
    //    for(int i=1; i<=line; i++){
    //     for(int j=1; j<=i; j++){
    //       System.out.print("*");
    //     }
    //     System.out.println();
    //    }
          
    // **** 
    // *** 
    // ** 
    // *
   
    //    for(int i=1; i<=line; i++){
    //     for(int j=i; j<=line; j++){    // or  for(int j=i; j<= (line-i+1); j++)
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //    }

    //  1
    //  12
    //  123
    //  1234
        //  for(int i=1; i<=line; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //  }

    // 1234
    // 123
    // 12
    // 1
        //  for(int i=1; i<=line; i++){
        //     for(int j=1; j<=(line-i+1); j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //  }

    // A 
    // BC 
    // DEF 
    // GHIJ
        int n = 4;
        char ch = 'A';

        for(int line=1; line<=4; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
