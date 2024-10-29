public class Solution2 {
    public static void main(String[] args) {
        int num = 43;
        int res = googlyPrime(43);
        System.out.println(res);

    }

    public static int googlyPrime(num){
        int rem = 0;
        while(num>0){
            rem = rem+num%10;
            num = num/10;
        }

        if(rem == 0) return -1;

        for(int i = 0; i<Math.sqrt(rem); i++){
            if(rem%i==0) return 0;
            if(rem%i!=0) return 1;
        }
        
    }
}
