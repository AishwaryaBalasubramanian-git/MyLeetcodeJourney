//myleetcodejourneyy
class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int pivotid=0,pivotcount=0;
        for(int i =1;i<n;i++){
            if(nums.get(i-1)>nums.get(i)){
                pivotid=i;
                pivotcount++;
            }

        }
        if(pivotcount>1) return -1;
        if(pivotcount==0) return 0;
        return nums.get(n-1)>nums.get(0) ? -1 : n-pivotid;

        
    }
}