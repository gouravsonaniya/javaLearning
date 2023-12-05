package String;
import java.util.*;
public class PracticeQuestion {

    public static void main(String[] args) {

         //ques 1

         Scanner sc = new Scanner(System.in);
         String str = sc.next();
         int count = 0;

         for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o' || ch=='u'){
                count++;
            }
         }
         System.out.println("count of vowels is : " +count);
;
        // String str = "ApnaCollege".replace("l", "");
        // System.out.println(str);  // output : ApnaCoege

        // //ques 4
        String str1 = "earth";
        String str2 = "heart";

        // convert to lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check length
        if(str1.length() == str2.length()){
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            // sort arrays

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            // check both are equal 

            boolean result = Arrays.equals(str1CharArray, str2CharArray);

            if(result){
                System.out.println(str1+ " and " + str2 + " are anagram of each other.");
            } else{
                 System.out.println(str1+ " and " + str2 + " are not  anagram of each other.");
            }
        } else{
            System.out.println(str1+ " and " + str2 + " are not  anagram of each other.");
        }  
    }
    
}
