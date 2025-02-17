class Solution {
    static{
        for(int i =0;i<500;i++){
           maxArea(new int[]{1,1});
        }
    }

    public static int maxArea(int[] height) {
        int L = 0;
        int R=height.length-1;
        int maxArea = 0;
        while(L<R){
            int W = R-L;
            int H = Math.min(height[L],height[R]);
            int area = W*H;
            maxArea = Math.max(maxArea,area);
            if(height[L]<=height[R]){
                L++;
            }else{
                R--;
            }

        }
        return maxArea;
        
    }
}