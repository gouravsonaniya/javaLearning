package twoDArrays;
import java.util.*;

public class Creation {
    public static boolean search(int matrix[][], int key){
    
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.print("found in cell ("+ i+","+j+ ")");
                    return true;
                }
            }
        }
        return false;
}  
    public static int printlargest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

          for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("smallest is "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int key = 5;
        int n = matrix.length, m = matrix[0].length;

       // input 
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // output

         for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
      //  System.out.println(search(matrix, key));
      System.out.println(printlargest(matrix));

    }
    
}
