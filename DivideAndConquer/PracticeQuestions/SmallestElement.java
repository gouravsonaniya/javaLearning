package DivideAndConquer.PracticeQuestions;

public class SmallestElement {

    public static int printSmallest(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            count = 0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println(printSmallest(arr));
    }
    
}
