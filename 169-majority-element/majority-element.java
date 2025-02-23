class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> freqmap = new HashMap<>();
        int resultNum=0;
        int majorityTimes=0;
        for(int n : nums){
            freqmap.put(n,freqmap.getOrDefault(n,0)+1);
            if(freqmap.get(n)>majorityTimes){
                majorityTimes=freqmap.get(n);
                resultNum=n;
            }
        }
        return resultNum;  
    }
}