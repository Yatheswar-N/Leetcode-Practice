package Leetcode;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        if(amount<coins[0]){
            return -1;
        }
        if(amount==0){
            return 0;
        }
        int i=coins.length-1,ans=0;
        while(amount>=0){
            if(amount>coins[i]){
                amount-=coins[i];
                ans++;
            }
            else if(i>-1 && amount<coins[i]){
                if(i==0 && amount<coins[0]){
                    return -1;
                }
                i--;
            }
            if(i>-1 && amount==coins[i]){
                ans++;
                return ans;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{2},3));
    }
}
