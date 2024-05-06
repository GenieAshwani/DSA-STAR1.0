package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Reaarange {

    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};

        arrange(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] arrange(int arr[])
    {
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> n=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0) n.add(arr[i]);
            else p.add(arr[i]);
        }

        int k=0;
        int j=0;

        for(int i=0;i<arr.length;i++)
        {
            //even index
            if(i%2==0)
            {
                arr[i]=p.get(k);
                k++;
            }
            else {
                arr[i]=n.get(j);
                j++;
            }

        }

        System.out.println(p);
        System.out.println(n);
        return  null;
    }

}
