package oops;

public class coustom {

    private int[] arr;
    private int size=10;
    private int index=0;
    coustom(){
        this.arr=new int[size];
    }
    void add(int num){
        if(index==arr.length){
            resize(num);
        }else{
            arr[index]=num;
            index++;
        }
    }
    void change(int i,int value){
        if(i<index){
            arr[i]=value;
        }
    }
    void print(){
        for(int i=0;i<index;i++){
                System.out.print(arr[i]+" ");
        }
    }
    void resize(int n){
        int temp[]=new int[size+size];
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
    int  get(int i){
        return arr[i];
    }

    public static void main(String[] args) {
        coustom c=new coustom();
        for(int i=1;i<=29;i++){
            c.add(i);
        }
        c.print();
    }
}
