//myleetcodejourney
class Solution {
    public int dominantIndex(int[] nums) {
        int max =0;
        int index =-1;
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        for(i=0;i<nums.length;i++){
            if((nums[i]*2)>max && i != index) return -1;
        }
        return index;

        
    }
}