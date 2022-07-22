package DSA;

public class sqrt {
    public static void main(String[] args) {
        System.out.printf("%.3f",sroot(40,3));
    }
    static double sroot(int n,int p){
        int start=0;
        int end=n;
        double root=0.0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==n){
                root=mid;
                return root ;
            }if(mid*mid>n){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
            double r =end;
            double pv=0.1;
            for(int i=0;i<p;i++){
                while(r*r<=n){
                    r=r+pv;
                }
                r=r-pv;
                pv=pv/10;
            }

        return r;
    }
}
