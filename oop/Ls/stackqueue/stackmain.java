package oop.Ls.stackqueue;

public class stackmain {
    public static void main(String[] args) {
        Stack s=new Stack(7);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(21);
        s.push(12);
        s.push(122);
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
