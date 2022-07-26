package oop.Ls.LLFinal;

public class Sll {
    private int size=0;
    private Node head;
    private Node tail;

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        if(head==null){
            tail=node;
        }
        head=node;
        size++;
    }
    public void insertLast(int val){
        if(head==null){
            insertFirst(val);
        }
        Node node=new Node(val);
        node.next=null;
        tail.next=node;
        tail=node;
        size++;
    }
    public void inserAtIndex(int index,int val){
        if(index<0 || index>size){
            System.out.println("You Cannot insert at "+index+" position");
            return;
        }
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
         for(int i=1;i<index;i++){
             temp=temp.next;
         }
            Node node=new Node(val);
            Node nextVal=temp.next;
            temp.next=node;
            node.next=nextVal;
            size++;
    }

    public void deleteStart(){
        if(head==null){
            System.out.println("there Is no Elements to delete");
            return;
        }
        if(head.next==null){
            tail=null;
            head=null;
            size--;
            return;
        }
        head=head.next;
        size--;

    }

    public void deleteEnd(){
        if(head==null){
            System.out.println("there Is no Elements to delete");
            return;
        }
        if(head.next==null){
            deleteStart();
            return;
        }
        Node temp=head;
        for(int i=1;i<size-1;i++){
            temp=temp.next;
        }
        if(temp==head){
            deleteStart();
            return;
        }
        temp.next=null;
        tail=temp;
        size--;
    }

    public void deleteIndex(int index){
        if(index<0 || index>=size){
            System.out.println("You Cannot Delete at "+index+" position");
            return;
        }
        if(index==0){
            deleteStart();
            return;
        }
        if(index==size-1){
            deleteEnd();
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;

    }
    public void rIndex(int val){
        if(head==null){
            System.out.println("Element is not present");
        }
        if(head.value==val){
            System.out.println("found at index "+0);
            return;
        }
        Node temp=head;
        for(int i=1;i<=size;i++){
            if(temp.value==val){
                int ind=i-1;
                System.out.println("found at index "+ind);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Element Not present");
    }
    public void display(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.value+"->");
           temp= temp.next;
        }
        System.out.println("END");
    }
   private class Node{
       private int value;
       private Node next;



       public Node(int value) {
           this.value = value;
       }

       public Node(int value, Node next) {
           this.value = value;
           this.next = next;
       }
   }
}
