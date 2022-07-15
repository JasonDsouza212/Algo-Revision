public class bitoperator {
    public static void main(String[] args) {
        int arr[]={2,3,1,2,3,6,1};
        System.out.println(nonrepeated(arr));
        System.out.println(oddoreven(20));
    }
    static boolean oddoreven(int num){
        return ((num&1)==1);
    }
    static int nonrepeated(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
}
