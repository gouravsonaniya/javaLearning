
public class LinearSearch{

    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
               return i;
            }
        }
        return -1;
    }

    public static int linearSearch(String menu[], String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
               largest= numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        //    int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        //    int key = 10;
        //    int index =  linearSearch(numbers, key);
        //    if(index == -1){
        //     System.out.println("Key not found");
        //    } else {
        //     System.out.println("key is at index : " +index);
        //    }
        
        // String menu[] = {"samosa", "kachori", "pani puri", "chole bhature", "puri"}; 
        // String key = "pani puri";
        // int index = linearSearch(menu, key);
        // if(index == -1){
        //    System.out.println("key not found");
        // } else {
        //     System.out.println("key found at index : " + index);
        // }
        int numbers[] = {1, 2, 6, 3, 5 };
        System.out.println("largest value is : " +getLargest(numbers));

    }   
       
    }