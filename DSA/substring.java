package DSA;

import java.util.ArrayList;

public class substring {
    public static void main(String[] args) {
//        System.out.println(sub("","abc"));
        System.out.println(subarray(new int[]{1,2,3}));
    }
    static ArrayList<String> sub(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> a=new ArrayList<>();
            a.add(p);
            return a;
        }
        char ch=up.charAt(0);
        ArrayList<String> first=sub(p+ch,up.substring(1));
        ArrayList<String> second=sub(p,up.substring(1));
        first.addAll(second);
        return first;
    }
    static ArrayList<ArrayList<Integer>> subarray(int[] arr){
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            int outersize= outer.size();
            for(int j=0;j<outersize;j++){
                ArrayList<Integer> inner=new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
