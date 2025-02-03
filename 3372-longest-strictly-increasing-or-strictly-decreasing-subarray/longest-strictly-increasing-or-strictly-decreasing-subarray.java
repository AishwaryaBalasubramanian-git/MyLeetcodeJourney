class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==0) 
            return 0;
        int maxlength =1,dec=1,inc=1;
        for(int i =1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                inc++;
                dec=1;
            }
            else if (nums[i-1]>nums[i]){
                dec++;
                inc=1;
            }
            else{
                dec=1;
                inc=1;
            }
            maxlength = Math.max(maxlength,Math.max(inc,dec));
        }
        return maxlength;
    }
}