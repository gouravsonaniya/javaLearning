package Pattern1;
public class PatternsAdvance {

    public static void hollow_Rectangle(int totRows, int totCols){

        //outer
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
           if(i==1 || j==1 || i==totRows || j==totCols){
            System.out.print("*");
           }
           else{
            System.out.print(" ");
           }

            }
            System.out.println();
        }
    }

public static void inverted_rotated_half_pyramid(int n){
    //outer 
    for(int i=1; i<=n; i++){
        //spaces
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }

        //stars
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void diamond(int n){

    for(int i=1; i<=n; i++){
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }

        for(int j=1; j<=(2*i)-1; j++){
           System.out.print("*");
        }
        System.out.println();
    }

    for(int i=n; i>=1; i--){
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }

        for(int j=1; j<=(2*i)-1; j++){
           System.out.print("*");
        }
        System.out.println();
    }
}
    
    public static void main(String[] args) {
      //  hollow_Rectangle();
      diamond(7);
    }
}
