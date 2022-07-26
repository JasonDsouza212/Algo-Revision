package oop.Ls.LLFinal;

public class cllmain {
    public static void main(String[] args) {
        Cll list=new Cll();
        list.inserFirst(4);
        list.inserFirst(3);
        list.inserFirst(2);
        list.inserFirst(1);
        list.display();
        list.insertEnd(5);
        list.inserAtIndex(2,100);
        list.display();
        list.deleteStart();
        list.deleteStart();


        list.display();
        list.deleteEnd();
        list.display();
        list.deleteEnd();
        list.display();
        list.deleteEnd();
        list.display();
        list.deleteEnd();
        list.display();

    }
}
