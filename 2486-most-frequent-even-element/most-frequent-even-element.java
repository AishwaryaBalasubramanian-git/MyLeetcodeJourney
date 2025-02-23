class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int resultnum=0;
        int majority=0;
        for(int n : nums){
            if(n%2==0){
                map.put(n,map.getOrDefault(n,0)+1);
                if(map.get(n)>majority ||map.get(n)==majority && n<resultnum){
                    majority=map.get(n);
                    resultnum=n;
                }
            }
        }
        
        return majority==0? -1:resultnum;
        
    }
}