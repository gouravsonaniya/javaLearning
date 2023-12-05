package String;
import java.util.*;

public class StringBuilder {
    public StringBuilder(String string) {
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for(char ch='a'; ch<='z'; ch++){
           sb.append(ch);
        } //abcdefgh
         //O(26)
         //O(n^2)
         System.out.println(sb);
    }

    public void append(String string) {
    }


    
}
