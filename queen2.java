public class queen2 {
    public static void main(String[] args) {
        int n=4;
        boolean ans[][]=new boolean[n][n];
        qn(ans,0,0,4);
    }
    static void qn(boolean [][] arr,int r,int c,int n){
        if(n==0 ){
            sou(arr);
            System.out.println();
            return;
        }
//        if(r== arr.length-1 && c == arr.length-1 ){
//            return;
//        }
//        if(r>= arr.length && n!=0){
//            System.out.println("not posiible");
//            return;
//        }
  if(r>= arr.length){
      return;
  }
        if(c >= arr.length){
            qn(arr,r+1,0,n);
            return;
        }
       if(isValid(arr,r,c)){
            arr[r][c]=true;
            qn(arr,r+1,0,n-1);
            arr[r][c]=false;

        }
        qn(arr,r,c+1,n);
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
    static boolean isValid(boolean arr[][],int r,int c){
        for(int i=0;i<r;i++){
            if(arr[i][c]){
                return false;
            }
        }
        int moveleft=Math.min(r,c);
        for(int i=1;i<=moveleft;i++){
            if(arr[r-i][c-i]){
                return false;
            }
        }
        int movrRight=Math.min(r, arr.length-c-1);
        for(int i=1;i<=movrRight;i++){
            if(arr[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
}
