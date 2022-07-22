package DSA;

import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 1, 3, 4, 3, 6};
//        System.out.println(linearn(arr,6));
//        System.out.println(linear(arr,10));
        int arr2[][] = {
                {1, 3, 2},
                {4, 3, 2},
                {3, 2, 1}
        };
        int num2[]={12,321,1234,3222231,2321,1232,1232,0};
        System.out.println(Arrays.toString(evenornot(num2)));
//        System.out.println(Arrays.toString(maxmin(arr)));
    }
    static int linearn(int arr[],int target){
        if(arr.length==0){
            return  -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static  boolean linear(int[] arr,int target){
        if(arr.length==0){
            return  false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    static int[] matrixSearch(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                     return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static  int[] maxmin(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
           if(arr[i]<min){
               min=arr[i];
           }
        }
        return new int[]{min,max};
    }
    static int[] evenornot(int arr[]){
        int evnnums=0;
        int evnnums2=0;
        for(int i=0;i<arr.length;i++){
            int ans=count(arr[i]);
            int ans2=c(arr[i]);
            if(ans%2==0){
                evnnums++;
            }
            if(ans2%2==0){
                evnnums2++;
            }
        }
        return  new int[]{evnnums,evnnums2};
    }
    static int count(int num){
        if(num==0){
            return 1;
        }
        int c=0;
        while(num>0){
            c++;
            num=num/10;
        }
        return c;
    }
    static int c(int num){
        if (num==0){
            return 1;
        }
        return (int)Math.log10(num)+1;
    }
}
