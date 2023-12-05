package Pattern1;
public class PatternAdvance {

    public static void hollow_rectangle(int totRows, int totCols){
        //outer loop
        for(int i=1; i<=totRows; i++){
            // inner loop
            for(int j=1; j<=totCols; j++){
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_rotated_half_Pyramid(int n){
         // outer loop
        for(int i=1; i<=n; i++){
            // space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void inverted_half_pyramid(int n){
        // out loop
        for(int i=1; i<=n; i++){
         //inner loop
         for(int j=1; j<=n-i+1; j++){
            System.out.print(j);
         }
         System.out.println();
        }
    }

    public static void floyd_triangle(int n){
        int counter = 1; 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zeroOnetriangle(int n) { 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 ==0 ){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
       //1st half 
        for(int i=1; i<=n; i++){
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1; i--){
             //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            //space 
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // hollow rectangle 
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        //1st half 
        for(int i=1; i<=n; i++){
            // space
            for(int j=1; j<=(n-i); j++){
               System.out.print(" ");
            }
            //star
            for(int j=1; j<=(2*i-1); j++){
               System.out.print("*");
            }
            System.out.println();
       } 
       //2nd half 
         for(int i=n; i>=1; i--){
            // space
            for(int j=1; j<=(n-i); j++){
               System.out.print(" ");
            }
            //star
            for(int j=1; j<=(2*i-1); j++){
               System.out.print("*");
            }
            System.out.println();
       } 
    }
    public static void main(String[] args) {
      //  hollow_rectangle(7,8 );
      //inverted_rotated_half_Pyramid(1000);
      //inverted_half_pyramid(5);
      //floyd_triangle(5);
     // zeroOnetriangle(5);
     //butterfly(5);
     //solid_rhombus(10);
     //hollow_rhombus(7);
     diamond(8);

    }
}
