package Collections.ArrayList;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int t=9;
        int[] res = twoSum(arr, t);
        System.out.println(Arrays.toString(res));

    }

    public static int[] twoSum(int arr[],int t)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int rem=t - arr[i];
            if(map.containsKey(rem))
            {
                return new int[]{map.get(rem),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{0};
    }
}
