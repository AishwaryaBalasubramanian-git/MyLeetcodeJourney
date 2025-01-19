class Solution {
    //myleetcodejourney
    public int[] twoSum(int[] nums, int target) {
      
        HashMap<Integer,Integer> checkbox = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            
                if(checkbox.containsKey(diff)){
                    return new int[]{i,checkbox.get(diff)};

                }
                checkbox.put(nums[i],i);
            
        }
        return null;
    }
}