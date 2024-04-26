package Array;

import java.util.HashMap;
import java.util.Map;

public class ContSubArray {
    public static void main(String[] args) {
        int k=3;
        int arr[]={5,0,0,0};
        System.out.println(checkSubArraySum(arr,k));
    }

    public static boolean checkSubArraySum(int arr[],int k)
    {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            int rem=sum%k;
            if(map.containsKey(rem))
            {
                if(i-map.get(rem)>=2)
                {
                    return true;
                }

            }
            else {
                map.put(rem,i);
            }
        }

        return false;
    }
}
