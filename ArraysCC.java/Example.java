import java.util.*;
public class Example {
    // q1
    public static boolean containsDoplicates(int nums[]){

        for(int i=0; i<nums.length-1; i++ ){
          for(int j=i+1; j<nums.length; j++){
            if(nums[i] == nums[j]){
                return true;
            }
          }
        }
       return false;
    }

    //Q2
    
    public static int printIndex(int nums[], int target){
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
       return -1;
    }

    //Q3 

    public static int busAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
           if(buyPrice < prices[i]){
             int profit = prices[i] - buyPrice;
             maxProfit = Math.max(profit, maxProfit);
           } else{
            buyPrice = prices[i];
           }
        }

        return maxProfit;
    }

    //q4

    public static int trappedRainwater(int height[]){
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
           leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i= n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;

        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }
    
    public static void main(String[] args) {
    //     int nums[] = {1, 2, 3, 2, 3, 1};
    //    System.out.println( containsDoplicates(nums));
   // int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
 //  int height[] = {4, 2, 0, 3, 2, 5};
   // System.out.println(trappedRainwater(height));
        //  int nums[] = {4, 5, 6, 7, 0, 1, 2};
        //  int target = 3;
        //  System.out.println(printIndex(nums, target));

        int [] prices = {7, 6, 4, 3, 1};
        System.out.println(busAndSellStocks(prices));


    }
    
}
