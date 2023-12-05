package BitManipulation;

public class PracticeQues {

    public static void swaptwo(int a, int b){
        System.out.println("before swap a : "+a+ " before swap b :" +b);
         a = a^b;
         b = a^b;
         a = a^b;
         System.out.println("after swap a : "+a+ " after swap b : "+ b); 
    }

    //ques 3

  
    public static void main(String[] args) {
        //swaptwo(5, 6);

     int x = 6;
     System.out.println(x+1 +"="+ -~x);
     
     
     for( char ch = 'A'; ch<='Z'; ch++){
        System.out.println((char) ( ch | ' '));
     }
    }
    
}
