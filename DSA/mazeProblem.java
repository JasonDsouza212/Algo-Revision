package DSA;

import java.util.ArrayList;

public class mazeProblem {
    public static void main(String[] args) {
//        System.out.println(mazeoo("",0,0,3,3));
        boolean arr[][]={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println(mazeoorestrictions(arr,"",0,0));
    }

    static ArrayList<String> maze(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> a=new ArrayList<>();
            a.add(p);
            return a;
        }
        ArrayList<String> ans= new ArrayList<>();

        if(r>1){
            ans.addAll(maze(p+'D',r-1,c));
        }
        if(c>1){
            ans.addAll(maze(p+'R',r,c-1));
        }
        return ans;
    }
    static ArrayList<String> mazedio(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> a=new ArrayList<>();
            a.add(p);
            return a;
        }
        ArrayList<String> ans= new ArrayList<>();

        if(r>1){
            ans.addAll(mazedio(p+'D',r-1,c));
        }
        if(c>1){
            ans.addAll(mazedio(p+'R',r,c-1));
        }
        if(r>1&&c>1){
            ans.addAll(mazedio(p+'G',r-1,c-1));
        }
        return ans;
    }
    static ArrayList<String> mazeoo(String p,int r,int c,int row,int col){
        if(r==row-1 && c==col-1){
            ArrayList<String> a=new ArrayList<>();
            a.add(p);
            return a;
        }
        ArrayList<String> ans= new ArrayList<>();

        if(r<row){
            ans.addAll(mazeoo(p+'D',r+1,c,row,col));
        }
        if(c<col){
            ans.addAll(mazeoo(p+'R',r,c+1,row,col));
        }
        if(r<row&&c<col){
            ans.addAll(mazeoo(p+'G',r+1,c+1,row,col));
        }
        return ans;
    }
    static ArrayList<String> mazeoorestrictions(boolean arr[][],String p,int r,int c){
        if(r==arr.length-1 && c==arr[0].length-1){
            ArrayList<String> a=new ArrayList<>();
            a.add(p);
            return a;
        }
        if(arr[r][c]==false){
            ArrayList<String> a=new ArrayList<>();
            a.add(" ");
            return a;
        }
        ArrayList<String> ans= new ArrayList<>();

        if(r<arr.length-1){
            ans.addAll(mazeoorestrictions(arr,p+'D',r+1,c));
        }
        if(c<arr[0].length-1){
            ans.addAll(mazeoorestrictions(arr,p+'R',r,c+1));
        }
        if(r<arr.length-1&&c<arr[0].length-1){
            ans.addAll(mazeoorestrictions(arr,p+'G',r+1,c+1));
        }
        return ans;
    }
    static void bacTracing(boolean arr[][],String p,int r,int c){
        if(r==arr.length-1&&c==arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(!arr[r][c]){
            return;
        }
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
    }
}
