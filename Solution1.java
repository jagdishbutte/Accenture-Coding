class Solution1{
    public static void main(String[] args) {
        String s = "1110110101";
        numToChar(s);
    }
   
    public static void numToChar(String s){
        StringBuilder ans = new StringBuilder();
        int count = 0;
        if(s.length()==0) return;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            
            else{
                if(count>0){
                    int num = count+64;
                    ans.append((char)num);
                    count = 0;
                }
            }
        }
        if(count>0){
            int num = count+64;
            ans.append((char)num);
        }
        System.out.print(ans);
    }
}