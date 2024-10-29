/*The function accepts an integer array ‘arr’ of size ‘n’ as its argument. Each element of ‘arr’ represents the number of chocolates distributed to a person. The function needs to return the minimum number of chocolates that need to be distributed to each person so that the difference
between the chocolates of any two people is minimized.*/

import java.util.*;

class chocolates{
    public static int minChocolates(int[] arr, int n){
        Arrays.sort(arr);
    
        int minChocolatesNeeded = Integer.MAX_VALUE;
            
        for (int i = 0; i < arr.length - 1; i++) {
            int chocolatesNeeded = arr[i + 1] - arr[i];
            minChocolatesNeeded = Math.min(minChocolatesNeeded, chocolatesNeeded);
        }     
       
        return minChocolatesNeeded;
    }
    public static void main(String args[]){
        int n = 5;
        int[] arr = {10,5,13,16,1};
        System.err.println(minChocolates(arr,n));

    }
    
}

