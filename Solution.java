
class Solution {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public int getMinDistance(int[] nums, int target, int start) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                ans = Math.min(ans, (i-start));
            }
        }
        return ans;
    }


    public static int[] assignTasks(int[] servers, int[] tasks) {
        int ans[] = new int[tasks.length];
        for(int i = 0; i<tasks.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j<servers.length; j++){
                min = Math.min(min,j);
                ans[i] = min;

                if(servers[j]>1){
                    j++;
                }
            }
        }
        return ans;
    }
 
    public static void main(String args[]){
        
    }
}


