import java.util.Arrays;

public class pattern {
    public static void main(String[] args) {
//        pat(4,0);
//        pattriangle(4,0);
        int arr[]={4,3,2,1,7,6,10};
        selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void pat(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            pat(r,c+1);
        }else{
            System.out.println();
            pat(r-1,0);
        }
    }
    static void pattriangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            pattriangle(r,c+1);
            System.out.print("* ");

        }else{
            pattriangle(r-1,0);
            System.out.println();

        }
    }
    static void bubble(int arr[],int a,int b){
        if(a==0){
            return;
        }
        if(b<a){
            if(arr[b]>arr[b+1]){
                int temp=arr[b];
                arr[b]=arr[b+1];
                arr[b+1]=temp;
                bubble(arr,a,b+1);
            }
        }else{
            bubble(arr,a-1,0);
        }
    }
    static void selection(int[] arr,int a,int b,int max){
        if(a==0){
            return;
        }
        if(b<a){
            if(arr[b+1]>arr[b]){
                selection(arr,a,b+1,b+1);
            }else{
                selection(arr,a,b+1,max);
            }
        }else{
            int temp=arr[a];
            arr[a]=arr[max];
            arr[max]=temp;
            selection(arr,a-1,0,0);
        }
    }
}
