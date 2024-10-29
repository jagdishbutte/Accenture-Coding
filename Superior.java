public class Superior{

    public static int superiorRight(int[] arr, int n){

        int count = 1;
        int maxFromRight = arr[n-1];
        for(int i = n-2; i>=0; i--){
            if(arr[i]>maxFromRight){
                count++;
                maxFromRight = arr[i];
            }
        }
        System.out.println(count);
        return count;
    }
    public static void main(String args[]){
        int[] arr = {10,2,8,9,7,4,2};
        int n = arr.length;

        superiorRight(arr, n);
    }
}