import java.util.*;
public class SelctionSort {
    
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
           for(int j=i+1; j<arr.length; j++){
            if(arr[minPos] > arr[j]){
                 minPos = j;
            }
           }
           //swap
           int temp = arr[minPos];
           arr[minPos] = arr[i];
           arr[i] = temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
       // int []arr = {1, 4, 1, 3, 2, 4, 3, 7};
       int arr[] = {5, 4, 1, 3, 2};
        selectionSort(arr);
      printArr(arr);

        // reverse Collection
      // Integer arr[] = {5, 4, 1, 3, 2};
       


      //  Arrays.sort(arr, 0, 3, Collections.reverseOrder());
         
    }
    
}
