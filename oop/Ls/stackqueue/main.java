package oop.Ls.stackqueue;

public class main {
    public static void main(String[] args) {
        cirQueue q=new cirQueue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.print();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.print();


    }
}
