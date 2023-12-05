package String;
import java.util.*;

public class Strings {

    public static void printLetter(String firstName){
        for(int i=0; i<firstName.length(); i++){
            System.out.print(firstName.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Gaurav";
      //  String firstName = sc.next();
      //   String firstName = sc.nextLine();
         String fName = "Gaurav";
         String lName = "Patel";
         String fullname = fName +" "+ lName;   //concatenation
         // System.out.println(fullname);
      //  System.out.println(fName.charAt(0));
      //  System.out.println(firstName.length());

       printLetter(lName);

        
    }
    
}
