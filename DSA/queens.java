package DSA;

public class queens {
    public static void main(String[] args) {
        boolean arr[][]={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int n=4;
        boolean ans[][]=new boolean[n][n];
        q(ans,0);
    }
    static void q(boolean arr[][],int row){
        if(row== arr.length){
            sou(arr);
            System.out.println();
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(safe(arr,row,i)){
               arr[row][i]=true;
               q(arr,row+1);
                arr[row][i]=false;
            }

        }

    }
    static void sou(boolean[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]){
                    System.out.print("Q " );
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    static boolean safe(boolean[][] arr,int r,int c){
        for(int i=0;i<r;i++){
            if(arr[i][c]){
                return false;
            }
        }
        int moverightUp=Math.min(r,arr.length-c-1) ;
        for(int i=1;i<=moverightUp;i++){
          if(arr[r-i][c+i]){
              return false;
          }
        }
        int moveLeftup=Math.min(r,c);
        for(int i=1;i<=moveLeftup;i++){
            if(arr[r-i][c-i]){
                return false;
            }
        }
        return true;
    }
}
