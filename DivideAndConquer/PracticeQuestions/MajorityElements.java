package DivideAndConquer.PracticeQuestions;

public class MajorityElements {
    //brute force approach
    public static int printMajority(int arr[]){
        int majorityElement = arr.length/2;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > majorityElement){
                return arr[i];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(printMajority(arr));
    }
}
