package Leetcode;

public class MinAbsDiffInBst {
    public static int ans=Integer.MAX_VALUE;
    public static int getMinimumDifference(TreeNode root) {
        helper(root);
        return ans;
    }
    public static void helper(TreeNode root){
        if(root==null){
            return;
        }
        int minLeft=Integer.MAX_VALUE,minRight=Integer.MAX_VALUE,min=Integer.MAX_VALUE;
        if(root.left!=null){
            minLeft=Math.abs(root.val-root.left.val);
        }
        if(root.right!=null){
            minRight=Math.abs(root.val-root.right.val);
        }
        min=Math.min(minRight,minLeft);
        ans=Math.min(min,ans);
        helper(root.left);
        helper(root.right);
    }

    public static void main(String[] args) {
        TreeNode fir=new TreeNode(1);
        TreeNode sec=new TreeNode(5);
        TreeNode thi=new TreeNode(3);
        TreeNode four=new TreeNode(1);
        TreeNode fif=new TreeNode(3);
//        fir.left=sec;
//        sec.left=four;
//        sec.right=fif;
//        four.right=thi;
        fir.right=sec;
        sec.left=thi;
        System.out.println(getMinimumDifference(fir));
    }
}
