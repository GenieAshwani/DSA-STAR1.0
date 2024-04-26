package Array;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

    public static void main(String[] args) {
        int arr[]={3,30,34,5,9};
        String res=largestNumber(arr);
        System.out.println(res);
    }

    public static String largestNumber(int arr[])
    {
        Integer temp[]=new Integer[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            temp[i]=arr[i];
        }

        Arrays.sort(temp,new MyComparator());
        StringBuilder sb=new StringBuilder();
        for(int x:temp)
        {
            sb.append(x);
        }
        String res=sb.toString();
        int i=0;
        while(i<res.length()-1 && res.charAt(i)=='0')
        {
            i++;
        }
        return res.substring(i);

    }

    static class MyComparator implements Comparator<Integer>
    {
        @Override
        public int compare(Integer a, Integer b) {
           String ab=a+""+b;
           String ba=b+""+a;
           return ba.compareTo(ab);
        }
    }
}
