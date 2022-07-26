package oop.Ls.LLFinal;

public class Dllmain {
    public static void main(String[] args) {
        Dll list=new Dll();
        list.insertStart(4);
        list.insertStart(3);
        list.insertStart(2);
        list.insertStart(1);
        list.insertEnd(5);
        list.insertEnd(6);
        list.insertIndex(3,100);
        list.deleteStart();
        list.display();
        list.printrev();
        list.deleteEnd();
        list.display();
        list.deleteIndex(4);
        list.display();
    }
}
