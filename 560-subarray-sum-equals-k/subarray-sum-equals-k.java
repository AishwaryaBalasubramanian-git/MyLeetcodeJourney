class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> frequencyMap = new HashMap<>();
        int prefixSum=0;
        int count=0;
        frequencyMap.put(0,1);
        for(int num:nums)
        {
            prefixSum+=num;
        if(frequencyMap.containsKey(prefixSum-k)){
            count+=frequencyMap.get(prefixSum-k);
            }
        frequencyMap.put(prefixSum,frequencyMap.getOrDefault(prefixSum,0)+1);
        }
        return count;
    
    }
}