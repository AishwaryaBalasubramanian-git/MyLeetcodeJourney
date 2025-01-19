//myleetcodejourney
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> result = new HashSet<>();
        int n = nums.length;

        for(int num:nums){
            if(result.contains(num)){
                return true;
            }
            result.add(num);
        }
          
        return false;
    }
}