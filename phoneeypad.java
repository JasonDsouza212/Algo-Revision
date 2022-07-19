public class phoneeypad {
    public static void main(String[] args) {
        String up="34";
        int digit=up.charAt(0)-'0';
        System.out.println(digit);
        pad(" ","23");
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
//        int digit=up.charAt(0)-48; both can be used
        for(int i=(digit-1)*3;i<digit*3;i++){
           char ch=(char)('a'+i);
           pad(p+ch,up.substring(1));
        }
    }
}
