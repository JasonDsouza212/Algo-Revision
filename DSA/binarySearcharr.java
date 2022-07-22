package DSA;

public class binarySearcharr {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,7,65,89};
        int[] a={9,8,7,6,5,4,3};
//        System.out.println(binary(arr,51));
//        System.out.println("jhshj");
        System.out.println(order(arr,5));
    }

    static int binary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if (arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    static int order(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean is=arr[0]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
             if(is){
                if (arr[mid]<target){
                     start=mid+1;
                 }else{
                     end=mid-1;
                 }
             }else{
                if (arr[mid]<target){
                     end=mid+1;
                 }else{
                     start=mid-1;
                 }
             }
        }
        return  -1;
    }
}
