import java.util.Arrays;

public class strictlySorted {
    public static void main(String[] args) {
        int matrix[][]={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,50}
        };
        System.out.println(Arrays.toString(search(matrix,7)));
    }
    static  int[] bsearch(int arr[][],int start,int end,int row,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }else if(arr[mid][row]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return new int[]{1,-1};
    }
    static int[] search(int[][] arr,int target){
        int row=arr.length;
        int col=arr[0].length;
        if(col==0){
            return new int[] {-1,-1};
        } if(row==1){
            bsearch(arr,0,col-1,0,target);
        }
        int rowstart=0;
        int rowend=row-1;
        int midcol=col/2;
        while(rowstart<(rowend-1)){
            int mid=rowstart+(rowend-rowstart)/2;
            if(arr[mid][midcol]==target){
                return new int[]{mid,midcol};
            }else if(target>arr[mid][midcol]){
                rowstart=mid;
            }else{
                rowend=mid;
            }
        }
        if(arr[rowstart][midcol]==target){
            return new int[]{rowstart,midcol};
        }
        if(arr[rowstart+1][midcol]==target){
            return new int[]{rowstart+1,midcol};
        }
        if(target<arr[rowstart][midcol]){
            return  bsearch(arr,0,midcol-1,rowstart,target);
        }if(target>arr[rowstart][midcol]&&target<=arr[rowstart][col-1]){
            return bsearch(arr,midcol+1,col-1,rowstart,target);
        }if(target<arr[rowstart+1][midcol]){
            return bsearch(arr,0,midcol-1,rowstart+1,target);
        }else{
            return  bsearch(arr,midcol+1,col-1,rowstart+1,target);
        }

    }
}
