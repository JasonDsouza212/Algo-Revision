package DSA;

import java.util.Arrays;

public class rowAndcolwisesorted {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(binsearch(arr,9)));
    }
    static int[] binsearch(int[][] arr,int target){
        int row=0;
        int col=arr[0].length-1;
        while(row<=arr.length&&col>=0){
//            int mid=row+(col-row)/2;
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            else if(arr[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};

    }
}
