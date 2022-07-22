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
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(6);
        c.add(7);
        c.add(8);
        c.add(9);
        c.add(10);
        c.add(11);
        c.add(12);
        c.add(13);
        c.add(14);
        c.add(15);
        c.add(16);
        c.add(17);
        c.add(18);
        c.add(19);
        c.add(20);
        c.add(21);
        c.change(5,500);
        c.pop();
        System.out.println(c.get(3));
        c.pop();
        c.print();
    }
}
