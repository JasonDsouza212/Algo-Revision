package DSA;

public class rec {
    public static void main(String[] args) {
        System.out.println(prod(142));
        System.out.println(zeros(10000420,0));
    }
    static int sum(int num){
        if(num==0){
            return 0;
        }
        return num%10 +sum(num/10);

    }
    static int prod(int num){
        if(num==0){
            return 1;
        }
        return num%10 *prod(num/10);

    }
    static int zeros(int num,int z){
        if(num==0){
            return z;
        }
        int last=num%10;
        if(last==0){
            return  zeros(num/10,z+1);
        }else{
            return zeros(num/10,z);
        }
    }

}
