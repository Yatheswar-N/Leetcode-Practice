package Leetcode;

/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;
class Main {
    Map<Integer,String> map=new HashMap<>();
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int max=1;
        boolean even=false;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                check(i,s,true);
            }
            check(i,s,false);
        }
        int ansKey=0;
        for(int maxKey:map.keySet()){
            ansKey=Math.max(ansKey,maxKey);
        }
        System.out.println(map.get(ansKey));
        return map.get(ansKey);
    }
    public void check(int i,String s,boolean even){
        int j=0,max=0;
        j=even?i+1:i;
        max=even?1:0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            max++;
            map.put(s.substring(i,j+1).length(),s.substring(i,j+1));
            i--;
            j++;

        }
        max=1;
    }
    public static void main (String[] args) {

//        String s="aacabdkacaa";
//        Main sol=new Main();
//        String ans=sol.longestPalindrome(s);
//        System.out.println(ans);
        int sum=0,x=123;
        while(x!=0){
            int last=x%10;
            sum=(sum*10)+last;
            if(sum>(Math.pow(2,32)-1)){
                System.out.println("0");
                System.out.println(Math.pow(-2,32));
                System.out.println((Math.pow(2,32)-1));
            }
            x/=10;
        }
        System.out.println(sum);
    }

}
