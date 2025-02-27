class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int left =0;
        for(int right=1; right<n; right++){
            if(nums[right]!=nums[left]){
                left++;
                nums[left]=nums[right];
            }
        }
        return left+1;
        
    }
}