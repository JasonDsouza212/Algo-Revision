package DSA;

public class recString {
    public static void main(String[] args) {
        System.out.println(skipApple("bapplecapplead"));
    }
    static String rma(String p,String up){
        if(up.isEmpty()){
            return p;
        }
        char fch=up.charAt(0);
        if(fch=='a'){
            return rma(p,up.substring(1));
        }
        else{
            return rma(p+fch,up.substring(1));
        }
    }
    static String inside(String up){
        if(up.isEmpty()){
            return "";
        }
        char fch=up.charAt(0);
        if(fch=='a'){
            return inside(up.substring(1));
        }
        else{
            return fch+ inside(up.substring(1));
        }
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0)+ skipApple(up.substring(1));
        }
    }
}
