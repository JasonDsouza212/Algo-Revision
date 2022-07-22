package DSA;

import java.util.Arrays;

public class bac {
    public static void main(String[] args) {
        boolean arr[][]={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int result[][]=new int[arr.length][arr[0].length];
        bacTracingMat(arr,"",0,0,result,1);
    }
    static void bacTracing(boolean arr[][],String p,int r,int c){
        if(r==arr.length-1&&c==arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(!arr[r][c]){
            return;
        }
       arr[r][c]=false;
        if(r<arr.length-1){
            bacTracing(arr,p+"D",r+1,c);
        }
        if(c<arr[0].length-1){
            bacTracing(arr,p+"R",r,c+1);
        }
        if(r>0){
            bacTracing(arr,p+"U",r-1,c);
        }
        if(c>0){
            bacTracing(arr,p+"R",r,c-1);
        }
      arr[r][c]=true;
    }
    static void bacTracingMat(boolean arr[][],String p,int r,int c,int ans[][],int count){
        if(r==arr.length-1&&c==arr[0].length-1){
            ans[r][c]=count;
            for(int i=0;i<arr.length;i++){
                System.out.println(Arrays.toString(ans[i]));
            }
            System.out.println(p);
            System.out.println();
            return;

        }
        if(!arr[r][c]){
            return;
        }
        arr[r][c]=false;
        ans[r][c]=count;

        if(r<arr.length-1){
            bacTracingMat(arr,p+"D",r+1,c,ans,count+1);
        }
        if(c<arr[0].length-1){
            bacTracingMat(arr,p+"R",r,c+1,ans,count+1);
        }
        if(r>0){
            bacTracingMat(arr,p+"U",r-1,c,ans,count+1);
        }
        if(c>0){
            bacTracingMat(arr,p+"L",r,c-1,ans,count+1);
        }
        arr[r][c]=true;
        ans[r][c]=0;
    }
}
