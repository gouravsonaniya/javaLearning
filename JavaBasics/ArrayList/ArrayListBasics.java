package ArrayList;
import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
         ArrayList<String> list2 = new ArrayList<>();
          ArrayList<Boolean> list3 = new ArrayList<>();

          list.add(1);
           list.add(2);
            list.add(3);
             list.add(4);
               list.add(5);
            // list.add(2, 10);
             
           //  System.out.println(list);
          // int element =  list.get(3);
          //  System.out.println(element);
        //  System.out.println( list.remove(2) );
        //  int element = list.set(2, 10);
        //  System.out.println(list);

         
      //   System.out.println(list.contains(3));
      System.out.println(list.size());

      for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i)+" ");
      }
      System.out.println();

      for(int i=list.size()-1; i>=0; i--){
        System.out.print(list.get(i)+" ");
      }
      System.out.println();


    }
}
