package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    private static List<List<Integer>> ans=new ArrayList<>();
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> p=new ArrayList<>();
        List<Integer> up=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            up.add(nums[i]);
        }
        helper(p,up);
        return ans;
    }
    public static void helper(List<Integer> p,List<Integer> up){
        if(up.size()==0){
            ans.add(new ArrayList<>(p));
            return;
        }
        List<Integer> p1=new ArrayList<>(p);
        int val=up.get(0);
        up.remove(0);
        helper(p1,new ArrayList<>(up));
        p1.add(val);
        helper(p1,new ArrayList<>(up));

    }

    public static void main(String[] args) {
        int[] n={1,2,3};
        System.out.println(subsets(n).toString());
    }
}
