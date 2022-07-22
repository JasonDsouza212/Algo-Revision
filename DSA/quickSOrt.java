package DSA;

import java.util.Arrays;

public class quickSOrt {
    public static void main(String[] args) {
        int arr[]={3,2,4,1,5};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int start=s;
        int end=e;
        int m=s+(e-s)/2;
        int pivot=arr[m];
        while(start<=end){
            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if (start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        quick(arr,s,end);
        quick(arr,start,e);
    }
}
