package oop.Ls.stackqueue;

public class dynamicstack extends Stack{
    public void push(int val){
        if(pointer==arr.length-1){
            int[] temp=new int[arr.length*2];
            for(int i=0;i<=pointer;i++){
                temp[i]=arr[pointer];
            }
            arr=temp;
        }
         super.push(val);
    }
}
