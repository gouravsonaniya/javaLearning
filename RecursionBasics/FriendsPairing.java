package RecursionBasics;

public class FriendsPairing {

    public static int friendsPairing(int n){
         // base case
         if(n==1 || n==2){
            return n;
         }
        //kaam
        //choice 
        //single
        // int fnm1 = friendsPairing(n-1);

        // //pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1)*fnm2;

        // //; totalways
        // int totWays = fnm1 + pairWays;
        // return totWays;

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
        
    }
    
}
