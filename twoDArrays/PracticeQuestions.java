package twoDArrays;

public class PracticeQuestions{
    //question 1
    public static int countSeven(int matrix[][], int key){
        int count=0;
       for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[i][j] == key){
                count++;
            }
        }
       }
       return count;
    }

    //question2
    public static int sumOfSecondRow(int nums[][]){
        int sum = 0;
        int row =1;
        for(int col=0; col<nums[0].length; col++){
            sum += nums[row][col];
        }

        return sum;
    }

    //question 3

    public static void printMatrix(int mat[][]){
        System.out.println("Matrix is : ");
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat[0].length; j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
    }
   

    public static void main(String[] args) {
        int matrix[][] = {{4, 7, 8},
                           {8, 8, 7}};

        int nums[][] = {{1, 4, 9},
                        {11, 4, 3},
                        {2, 2, 3}};

       int row =2, col=3;
        int mat[][] = {{1, 2, 3},
                       {4, 5, 6}};

        int key = 7;
       // System.out.println(countSeven(matrix, key));
        System.out.println(sumOfSecondRow(nums));
         
        printMatrix(mat);

         int newMat[][] = new int [col][row];
         for(int i=0; i<row; i++){
             for(int j=0; j<col; j++){
                 newMat[j][i] = mat[i][j];
             }
         }
         printMatrix(newMat);
         
    }
}