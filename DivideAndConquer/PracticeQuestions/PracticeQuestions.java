package DivideAndConquer.PracticeQuestions;

public class PracticeQuestions {



    public static void mergeSort(String arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(String arr[], int si, int mid, int ei){
        String temp[] = new String[ei-si+1];
        int i = si; //left part
        int j = mid+1; //right part
        int k = 0; 

        while(i<=mid && j<=ei){
            if(isAlphabeticallySmaller(arr[i], arr[j])){
               temp[k] = arr[i];
               i++;
            } else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }
    // return true if str1 appear before str2
    public static boolean isAlphabeticallySmaller(String str1, String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
      //  String arr[] = {"sun", "earth", "mars", "mercury"};
        String arr[] = {"apple", "anar", "mango", "lemon", "meggi"};
        mergeSort(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    
}
