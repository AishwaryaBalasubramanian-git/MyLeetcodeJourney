class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int prefixSum = 0;
        int subarrayLength= 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            prefixSum += nums[i]==0 ? -1:1;
            if(prefixSum==0){
                subarrayLength =i+1;
            }
            else if(map.containsKey(prefixSum)){
                subarrayLength =Math.max(subarrayLength, i-map.get(prefixSum));

            }else{
                map.put(prefixSum,i);
            }
        }
        return subarrayLength;
    }
}