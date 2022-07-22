package DSA;

public class nKing {
    public static void main(String[] args) {
        int n=4;
        boolean ans[][]=new boolean[n][n];
        king(ans,0);
    }
    static void king(boolean arr[][],int row){
        if(row== arr.length){
            sou(arr);
            System.out.println();
            return;
        }

        for(int i=0;i<=arr.length;i++){

            if(i==arr.length){
                king(arr,row+1);
                return;
            }
            if(safe(arr,row,i)){
                arr[row][i]=true;
                king(arr,row+1);
                arr[row][i]=false;
            }

        }

    }
    static void sou(boolean[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]){
                    System.out.print("K " );
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
    static boolean safe(boolean[][] arr,int r,int c){
        if(index(arr,r-1,c-2)){
            if(arr[r-1][c-2]){
                return false;
            }
        }

        if(index(arr,r-1,c+2)){
            if(arr[r-1][c+2]){
                return false;
            }
        }

        if(index(arr,r-2,c-1)){
            if(arr[r-2][c-1]){
                return false;
            }
        }

        if(index(arr,r-2,c+1)){
            if(arr[r-2][c+1]){
                return false;
            }
        }


        return true;
    }
    static boolean index(boolean arr[][],int row,int col){
        if(row>=0 && row<arr.length && col>=0 &&col< arr.length){
            return true;
        }
        return false;
    }
}
