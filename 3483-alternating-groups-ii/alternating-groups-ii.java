class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length, ans = 0, w =1;
        for(int i=0 ;i<n+k-2;i++){
            if(colors[i%n]!= colors[(i-1+n)%n]){
                w++;
            }else{
                w=1;
            }
            if(w >= k ){
                ans++;
            }
        }
        return ans;
    }
}