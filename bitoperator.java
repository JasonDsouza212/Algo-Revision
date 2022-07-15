public class bitoperator {
    public static void main(String[] args) {
        int arr[]={2,3,1,2,3,6,1};
//        System.out.println(nonrepeated(arr));
//        System.out.println(oddoreven(20));
//        System.out.println(bitatpos(101101,3));
//        System.out.println(ithbit(101101,3));
        System.out.println(magicnum(6));
        System.out.println(noofBits());
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
    static int bitatpos(int num,int p){
        return num &(1<<p-1);
    }
    static int ithbit(int num,int n){
        return num | (1 << n-1);
    }
    static int magicnum(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            ans=ans+last*base;
            base=base*5;
            n=n>>1;
        }
        return ans;
    }
    static int noofBits(){
        int n=10;
        int b=2;
        int ans=(int)(Math.log(n)/Math.log(b))+1;
        return ans;
    }
}
