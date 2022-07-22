package DSA;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(orime(12));
        int n=40;
        boolean arr[]=new boolean[n+1];
        primenumRange(n,arr);
        for(int i=2;i< arr.length;i++){
            if(!arr[i]){
                System.out.print(i+" ");
            }
        }

    }
    static boolean orime(int num){
        if(num<=0){
            return false;
        }

        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
    static void primenumRange(int n,boolean arr[]){
        for(int i=2;i*i<n;i++){
            if(!arr[i]){
                for(int j=i+i;j<arr.length;j+=i){
                    arr[j]=true;
                }
            }
        }
    }
}
