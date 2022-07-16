public class isPrime {
    public static void main(String[] args) {
        System.out.println(orime(12));
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
}
