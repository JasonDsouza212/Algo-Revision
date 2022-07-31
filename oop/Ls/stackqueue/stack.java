package oop.Ls.stackqueue;

public class stack {
    private int arr[];
    private static int size=10;

    int pointer=-1;
    public stack(){
        this(size);
    }
    public stack(int size){
        this.arr=new int[size];
    }

    public void push(int val){
        if(pointer==arr.length-1){
            System.out.print("Stack is full");
        }
        pointer++;
        arr[pointer]=val;
    }
    public void pop(){
        if(pointer== -1){
            System.out.print("Stack is full");
        }
        int poped=arr[pointer];
        System.out.println(poped);
        pointer--;
    }
    public void peek(){
        System.out.println(arr[pointer]);
    }
    public void display(){
        if(pointer== -1){
            System.out.print("Stack is full");
        }
       for(int i=0;i<=pointer;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
