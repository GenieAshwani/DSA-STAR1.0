package DP;

import java.util.Arrays;

public class LongestSS {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,2,3};
        int rs = helper(arr);
        System.out.println(rs);
    }

    public static int helper(int arr[] )
    {
        if(arr==null||arr.length==0) return 0;
        int n=arr.length;
        int []dp=new int[n];
        Arrays.fill(dp,1);

        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j])
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }

        int res=0;
        for(int len:dp)
        {
            res=Math.max(res,len);
        }
        return res;
    }
}
