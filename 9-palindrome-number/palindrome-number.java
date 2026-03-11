class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int copyValue = x;
        int remainder = 0;
        while(x>0){
            remainder = (remainder*10)+(x%10);
            x/=10;

        }
        return remainder == copyValue;
        
    }
}