package Array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={10,2,44,1,55,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //O(n2)
    public static void bubbleSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
