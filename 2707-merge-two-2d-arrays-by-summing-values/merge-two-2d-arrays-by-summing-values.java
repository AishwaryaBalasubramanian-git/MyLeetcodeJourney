import java.util.*;
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        List<int[]> result = new ArrayList<>();
        int p1 = 0,p2=0;
        int m = nums1.length;
        int n = nums2.length;

        while(p1<m && p2<n){
            if(nums1[p1][0]==nums2[p2][0]){
                result.add(new int[]{nums1[p1][0], nums1[p1][1]+nums2[p2][1]});
                p1++;
                p2++;
            }else if(nums1[p1][0]<nums2[p2][0]){
                result.add(nums1[p1]);
                p1++;
            }else{
                result.add(nums2[p2]);
                p2++;
            }
        }
            while(p1<m){
                result.add(nums1[p1]);
                p1++;
            }
            while(p2<n){
                result.add(nums2[p2]);
                p2++;
            }
            int[][] resultFinal = new int[result.size()][2];
            for(int k =0;k<result.size();k++){
                resultFinal[k]=result.get(k);
            }
        
        return resultFinal;
        
    }
}