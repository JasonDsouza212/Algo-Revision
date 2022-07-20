public class nKnights {
    public static void main(String[] args) {
        int n=4;
        boolean ans[][]=new boolean[n][n];
        kn(ans,0,0,4);
    }
    static void kn(boolean arr[][],int r,int c,int k){
        if(r== arr.length){
            return;
        }
        if(k==0){
            sou(arr);
            System.out.println();
            return;
        }

        if(c==arr.length){
            kn(arr,r+1,0,k);
            return;
        }
        if(isSafe(arr,r,c)){
            arr[r][c]=true;
            kn(arr,r,c+1,k-1);
            arr[r][c]=false;
        }
        kn(arr,r,c+1,k);
    }
    static boolean isSafe(boolean arr[][],int r,int c) {
        if (isValid(arr, r - 1, c - 2)) {
            if (arr[r - 1][c - 2]) {
                return false;
            }
        }

        if (isValid(arr, r - 1, c + 2)) {
            if (arr[r - 1][c + 2]) {
                return false;
            }
        }

        if (isValid(arr, r - 2, c - 1)) {
            if (arr[r - 2][c - 1]) {
                return false;
            }
        }

        if (isValid(arr, r - 2, c + 1)) {
            if (arr[r - 2][c + 1]) {
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean arr[][],int r,int c){
        if(r>=0 && r< arr.length && c>=0 && c< arr.length){
            return true;
        }
        return  false;
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
}
