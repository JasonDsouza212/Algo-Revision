package DSA;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        System.out.println(permiList("","abc"));
        System.out.println(permicount("","abc"));
    }
    static void permi(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<p.length()+1;i++){
            String s=p.substring(0,i);
            String e=p.substring(i,p.length());
            permi(s+ch+e,up.substring(1));
        }

    }
    static ArrayList<String> permiList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> a=new ArrayList<>();
             a.add(p);
            return a;
        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i<p.length()+1;i++){
            String s=p.substring(0,i);
            String e=p.substring(i,p.length());
            ans.addAll(permiList(s+ch+e,up.substring(1)));
        }
        return ans;

    }
    static int permicount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=up.charAt(0);
        int count=0;
        for(int i=0;i<p.length()+1;i++){
            String s=p.substring(0,i);
            String e=p.substring(i,p.length());
            count=count+permicount(s+ch+e,up.substring(1));
        }
        return count;

    }
}
