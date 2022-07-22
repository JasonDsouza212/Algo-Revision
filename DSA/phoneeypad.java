package DSA;

import java.util.ArrayList;

public class phoneeypad {
    public static void main(String[] args) {
//        String up="34";
//        int digit=up.charAt(0)-'0';
//        System.out.println(digit);
//        pad(" ","23");
        System.out.println(padArrayList("","45"));
        dice("",4);
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
    static ArrayList<String> padArrayList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> a=new ArrayList<>();
            a.add(p);
            return a;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> ans=new ArrayList<>();
//        int digit=up.charAt(0)-48; both can be used
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(padArrayList(p+ch,up.substring(1)));
        }
        return ans;
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i=1;i<=6 &&i<=target;i++){
            dice(p+i,target-i);
        }
    }
}
