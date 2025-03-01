class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left =0;
        int right=n-1;
        
        while(left<right){
            int targetSum = numbers[left]+numbers[right];
            if(targetSum==target){
                return new int[]{left+1,right+1};
            }else if(targetSum>target){
                right--;
            }else{
                left++;
            }    
        }      
        return new int[]{};
    }
}