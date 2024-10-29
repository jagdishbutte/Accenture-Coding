import java.util.Scanner;

public class Parking {

    public static int parkingLot(char[] arr, int n){
        int count = 0;

        for(int i = 0; i<n; i++){
            if(arr[i] == 's'){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Characters: "); 
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        int n = arr.length;
        System.out.print(parkingLot(arr, n));
        sc.close();
    }
    
}
