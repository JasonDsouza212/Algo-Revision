package oop.Ls;

public class main {
    public static void main(String[] args) {
        Sll l=new Sll();
//        l.insertFirts(6);
//        l.insertFirts(5);
//        l.insertFirts(4);
//        l.insertFirts(3);
//        l.insertlast(7);
//        l.insertlast(8);
//        l.indexInsert(2,10);
//         l.indexInsert(0,23);
//        l.insertFirts(3);
//        l.insertlast(7);
//        l.indexInsert(10,23);
//        l.insertFirts(1);
//        l.insertFirts(2);
//        l.insertFirts(3);
//        l.print();
//        l.deleteStart();
//        l.deleteEnd();
//        l.print();
//        l.deleteIndex(2);
//        l.print();
////        l.deleteValue(13);
//        l.findValue(239);
//        l.print();
        Dll list=new Dll();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertIndex(30,100);
        list.print();
        list.printrev();
    }
}
