package oop.Ls.stackqueue;

public class Stack {
    protected int arr[];
    protected static int size=10;

    int pointer=-1;
    public Stack(){
        this(size);
    }
    public Stack(int size){
        this.arr=new int[size];
    }

    public void push(int val){
        if(pointer==arr.length-1){
            System.out.println("Stack is full");
            return;
        }
        pointer++;
        arr[pointer]=val;
    }
    public void pop(){
        if(pointer== -1){
            System.out.println("Stack is Empty");
            return;
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
            System.out.println("Stack is empty");

            return;
        }
       for(int i=0;i<=pointer;i++){
           System.out.print(arr[i]+" ");
       }
        System.out.println();
    }
}
