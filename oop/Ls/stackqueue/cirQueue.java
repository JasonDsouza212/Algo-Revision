package oop.Ls.stackqueue;

public class cirQueue {
    protected int arr[];
    protected static int size=10;

    int start=0;
    int end=0;
    int sizee=0;
    public cirQueue(){
        this(size);
    }
    public cirQueue(int size){
        this.arr=new int[size];
    }
    public void insert(int val){
        if(sizee==arr.length){
            System.out.println("Queue is Full");
            return;
        }
        arr[end]=val;
        end=end+1;
        end=end% arr.length;
        sizee++;
    }
    public void delete(){
        if(sizee==0){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(arr[start]);
        start=start+1;
        start=start%arr.length;
        sizee--;
    }
    public void print(){
        int i=start;
        if(end==start){
            System.out.println(arr[end]);
            return;
        }
        do{
            System.out.print(arr[i]+"->");
            i=i+1;
            i=i% arr.length;
        }while(i!=end);
        System.out.print("end");
    }
}
