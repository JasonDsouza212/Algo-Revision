package oop.Ls.stackqueue;

public class Queuemain {
    public static void main(String[] args) throws Exception {
        CustomQueue q=new CustomQueue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.insert(1);
        q.display();
        q.remove();
        q.display();
    }
}
