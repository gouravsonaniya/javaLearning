package String;

import java.io.IOException;

public class StringCompression {

    public static String compress(String str){
        String newStr = "";

        for(int i=0; i<str.length(); i++){  //O(n)
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
           
        }
        return newStr;
    }

    public static String compressByBuilder(String str){
        StringBuffer newStr = new StringBuffer("");
        
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1){
                 newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) throws IOException {
        String str = "aaabbcccdd";
        // String str = "abcd";
       // System.out.println(compress(str));
       System.out.println(compressByBuilder(str));
    }
    
}
