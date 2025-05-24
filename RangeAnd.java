package Leetcode;

public class RangeAnd {
    public static int rangeBitwiseAnd(int left, int right) {
        int ans=left;
        while (left<=right){
            ans&=left;
            if(ans==0){
                return 0;
            }
            left++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(2147483646,2147483647));
        int a=0;
        
    }
}
