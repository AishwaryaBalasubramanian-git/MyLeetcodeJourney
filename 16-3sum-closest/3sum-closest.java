import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int resultSum = 0;
        int closestDistance = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return target;
                }else if(sum<target){
                    j++;
                }else{
                    k--;
                }
                int currentDistance = Math.abs(sum-target);
                if(currentDistance<closestDistance){
                    resultSum = sum;
                    closestDistance = currentDistance;
                }
            }
        }
        return resultSum;
    }
}