package oop.Ls.LLFinal;

public class main {
    public static void main(String[] args) {
        Sll list=new Sll();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(100);
        list.insertLast(101);
        list.inserAtIndex(3,21);
        list.inserAtIndex(0,21);
        list.display();
        list.deleteEnd();
//        list.deleteEnd();
//        list.deleteEnd();
//        list.deleteEnd();
//        list.deleteEnd();
//        list.deleteEnd();
//        list.deleteEnd();
//        list.deleteEnd();
          list.deleteIndex(3);
        list.display();
        list.deleteIndex(6);


        list.display();
        list.rIndex(10);

    }
}
