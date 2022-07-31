package oop.Ls.stackqueue;

public class CustomQueue {
    protected int arr[];
    protected static int size=10;

    int pointer=-1;
    public CustomQueue(){
        this(size);
    }
    public CustomQueue(int size){
        this.arr=new int[size];
    }
    public void insert(int val){
        if(pointer==arr.length-1){
            System.out.println("Queue is Full");
            return;
        }
        pointer++;
        arr[pointer]=val;
    }
    public void remove() throws Exception {
        if(pointer==-1){
            throw new Exception("QUEUE IS EMPTY");
        }
        System.out.println(arr[0]);
        for(int i=1;i<=pointer;i++){
            arr[i-1]=arr[i];
        }
        pointer--;
    }
    public void display(){
        for(int i=0;i<=pointer;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
