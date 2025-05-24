package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFreq {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        int[] freq=new int[1000];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int element:map.keySet()){
            freq[map.get(element)]=element;
        }
        int index=0,count=999;
        while(count>=0 && index<k){
            if(freq[count]!=0){
                ans[index]=freq[count];
                index++;
            }
            count--;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,2},2)));

    }
}
