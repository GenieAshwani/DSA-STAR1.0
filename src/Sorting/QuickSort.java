package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int arr[]={4,6,1,10,9,8};
        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
    public static void quickSort(int arr[],int l,int h)
    {
        if(l<h)
        {
            int pivot=partition(arr,l,h);
            quickSort(arr,l,pivot-1);
            quickSort(arr,pivot+1,h);
        }
    }

    public static int partition(int arr[],int l,int h)
    {
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<h;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }
        int tmp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=tmp;
        return i+1;
    }
}
