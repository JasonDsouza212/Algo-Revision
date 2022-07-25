package oops;

import java.util.Arrays;

public class CustomArrayList<L> {

    private Object [] arr;
    private int size=10;
    private int index=0;
    CustomArrayList(){
        this.arr=new Object[size];
    }
    void add(L num){
        if(index==arr.length){
            resize(num);
        }else{
            arr[index]=num;
            index++;
        }
    }
    void change(int i,L value){
        if(i<index){
            arr[i]=value;
        }
    }
    void print(){
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
    }
    void resize(L n){
        Object temp[]=new Object[size+size];
        size=size+size;
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        temp[index]=n;
        index++;
        arr=temp;
    }
    void pop(){
        arr[index-1]=0;
        index--;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    L  get(int i) {
        return (L)arr[i];
    }

    public static void main(String[] args) {
        CustomArrayList<String> s=new CustomArrayList<>();
        s.add("Jason");
        s.add("Mazan");
        s.add("reema");
        s.change(1,"reema");

        s.pop();
        System.out.println(s.toString());
        s.print();
    }
}
