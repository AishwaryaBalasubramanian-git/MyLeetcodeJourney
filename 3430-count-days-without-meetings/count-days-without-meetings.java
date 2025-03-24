class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,Comparator.comparingInt(a -> a[0]));
        int prevend =0;
        for(int[] meeting : meetings){
            int start = meeting[0];
            int end = meeting[1];

            start = Math.max(start, prevend+1);
            int length = end-start+1;
            days -=Math.max(length,0);
            prevend = Math.max(prevend,end); 
        }
        return days;
    }
}