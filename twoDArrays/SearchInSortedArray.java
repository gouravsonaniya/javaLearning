package twoDArrays;

public class SearchInSortedArray {


    public static boolean searchKey(int matrix[][], int key){

        int row = 0, col = matrix[0].length-1;
        //start top right
        while(row < matrix.length && col>=0 ){
            if(matrix[row][col] == key){
                System.out.print("found key at index ("+row+","+col+")");
                return true;
            } else if(matrix[row][col] > key){
                col--;
            } else{
                row++;
            }
        }
        System.out.print("key not exit");
        return false;
    }   
    // search from left bottom

    public static boolean searchFromBottom(int matrix[][], int key){
        int row = matrix.length-1, col =0;

        while(row >=0 && col < matrix[0].length){
            if(matrix[row][col] == key){
                System.out.print("found key at index ("+row+","+col+")");
                return true; 
            } else if(matrix[row][col] < key){
                col++;
            } else{
                row--;
            }
        }
        System.out.print("key not exit");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 20;     
       // searchKey(matrix, key);  
        searchFromBottom(matrix, key);           
    }
    
}
