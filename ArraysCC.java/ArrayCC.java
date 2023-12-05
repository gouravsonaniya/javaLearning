import java.util.*;

public class ArrayCC{
   
  public static void update(int marks[]){
    for(int i=0; i<marks.length; i++){
      marks[i] = marks[i] + 1;
    }
  }
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    // int marks[] = new int[50];
    // marks[0] = sc.nextInt();
    // marks[1] = sc.nextInt();
    // marks[2] = sc.nextInt();
    // System.out.println("Physics = " + marks[0]);
    // System.out.println("Maths = " + marks[1]);
    // System.out.println("Chemistry = " + marks[2]);
    // System.out.println("Length of th array is = " + marks.length);
    // int percentage = (marks[0] + marks[1] + marks[2])/3;
    // System.out.println("Percentage is = "+percentage+ " %");
       int marks[] = {97, 98, 99};
       update(marks);
       // print our marks 
       for(int i=0; i<marks.length; i++){
        System.out.print(marks[i]+" ");
       }
       System.out.println();
   }
}