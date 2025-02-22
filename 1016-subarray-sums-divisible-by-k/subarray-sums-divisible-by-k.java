class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefixSum=0;
        int count=0;
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        freqMap.put(0,1);

        for(int num : nums){
            prefixSum += num;
            int mod = prefixSum%k;
            if(mod<0){
                mod+=k;
            }
        
        if(freqMap.containsKey(mod)){
            count+=freqMap.get(mod);
        }
        freqMap.put(mod,freqMap.getOrDefault(mod,0)+1);
    }
        return count; 
    }
    
}