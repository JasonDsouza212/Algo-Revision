package DSA;

public class introRec {
    public static void main(String[] args) {
        System.out.println(fib(5));
        int arr[]={1,2,3,5,8,9,13,16};
        System.out.println(binary(arr,0,arr.length,9));
        System.out.println(fact(5));
    }
    static int fib(int num){
        if(num<2){
            return num;
        }
        return fib(num-1)+fib(num-2);
    }
    static  int binary(int arr[],int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            return binary(arr,start,mid-1,target);
        }else{
            return binary(arr,mid+1,end,target);
        }
    }
    static int fact(int num){
        if(num==1){
            return 1;
        }
        return num * fact(num-1);
    }
}
