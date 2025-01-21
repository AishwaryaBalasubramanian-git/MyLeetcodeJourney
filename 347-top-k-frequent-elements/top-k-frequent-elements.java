class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> countmap = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(!countmap.containsKey(nums[i])) countmap.put(nums[i],0);
            countmap.put(nums[i], countmap.get(nums[i])+1);
        }
        Map <Integer,List<Integer>> reversemap = new HashMap<>();
        for(int num: countmap.keySet()){
            int count = countmap.get(num);
            if(!reversemap.containsKey(count)) reversemap.put(count,new ArrayList<Integer>());
            reversemap.get(count).add(num);
        }
        
        int[] result = new int[k];
        int index = 0;
        for(int possiblecount=nums.length;possiblecount >= 1; possiblecount--){
            if(reversemap.containsKey(possiblecount)){
                for(int n :reversemap.get(possiblecount)){
                    if(index<k){
                        result[index++]=n;
                    }
                    else{
                        break;
                    }
                }
            }
            if(index>=k){
                break;
            }
            
        }
            
        return result;
       
        
        
    }
}