import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int resultSum = nums[0]+nums[1]+nums[2];
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
                int currentDistance = Math.abs(target-sum);
                if(currentDistance<closestDistance){
                    resultSum = sum;
                    closestDistance = currentDistance;
                }
            }
        }
        return resultSum;
    }
}