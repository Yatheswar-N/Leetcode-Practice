package Leetcode;

public class RemoveDupInSorted {
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
