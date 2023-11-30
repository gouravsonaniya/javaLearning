package Loop;
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
    
        for(int i = 1; i<=10; i++){
            int table = i*num;
            System.out.print(i + " * " + num + " = " + table);
            System.out.println();
        }
    }
    
}
