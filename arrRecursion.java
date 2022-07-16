import java.util.ArrayList;

public class arrRecursion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,2,6};
        System.out.println(sorted(arr,1));
        System.out.println(searchindexAndaddToList(arr,2,0,new ArrayList<>()));
    }
    static boolean sorted(int arr[],int i){
        if(i>=arr.length){
            return true;
        }
        return arr[i]>arr[i-1] && sorted(arr,i+1);
    }
    static boolean search(int[] arr,int target,int i){
        if(i>=arr.length){
            return false;
        }
        return arr[i]==target ||search(arr,target,i+1);
    }
    static int searchindex(int[] arr,int target,int i){
        if(i>=arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        else{
           return searchindex(arr,target,i+1);
        }
    }
    static ArrayList<Integer> searchindexAndaddToList(int[] arr, int target, int i,ArrayList<Integer> a){
        if(i>=arr.length){
            return a;
        }
        if(arr[i]==target){
            a.add(i);
        }
            return searchindexAndaddToList(arr,target,i+1,a);
    }
}
