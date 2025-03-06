class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentMax = 0, currentMin = 0, totalMax = nums[0], totalMin = nums[0], totalSubsum = 0;
        for(int num : nums){
            totalSubsum+=num;
            currentMax = Math.max(num, currentMax+num);
            totalMax = Math.max(currentMax, totalMax);

            currentMin = Math.min(num,currentMin+num);
            totalMin = Math.min(currentMin, totalMin);
        }
        return totalMax>0 ? Math.max(totalSubsum-totalMin,totalMax):totalMax;
        
    }
}