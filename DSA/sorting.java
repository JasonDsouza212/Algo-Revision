package DSA;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int arr[]={4,3,2,1,6,5,2,32,12};
        int arr2[]={5,3,2,4,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        cyslicSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    static void bubbleSort(int arr[]){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int lasI=arr.length-1-i;
            int maxIndex=maxInde(0,lasI,arr);
            swap(lasI,maxIndex,arr);
        }
    }
    static int maxInde(int start,int end,int arr[]){
        int maxI=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[maxI]){
                maxI=i;
            }
        }
        return maxI;

    }
    static void swap(int one,int two,int[] arr){
        int temp=arr[one];
         arr[one]=arr[two];
        arr[two]=temp;
    }
    static void cyslicSort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
    }
}
