package oop.Ls.LLFinal;

public class Cll {
    private int size=0;
    private Node head;
    private Node tail;

   public void inserFirst(int val){
       Node node=new Node(val);
       node.next=head;
       if(head==null){
           tail=node;
       }
       head=node;
       if(head!=null){
           tail.next=head;
       }
       size++;
   }
    public void insertEnd(int val){
       if(head==null){
           inserFirst(val);
           return;
       }
        Node node=new Node(val);
        tail.next=node;
        node.next=head;
        node=tail;
        size++;
    }

    public void inserAtIndex(int index,int val){
        if(index<0 || index>size){
            System.out.println("You Cannot insert at "+index+" position");
            return;
        }
        if(index==0){
            inserFirst(val);
            return;
        }
        if(index==size){
            insertEnd(val);
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
           System.out.println("no elements to delete");
           return;
       }
       if(head==tail){
           head=null;
           tail=null;
           size--;
           return;
       }
       head=head.next;
       tail.next=head;
       size--;
    }

    public void deleteEnd(){
        if(head==null){
            System.out.println("no elements to delete");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            size--;
            return;
        }
       Node temp=head;
       for(int i=0;i<size;i++){
           temp=temp.next;
       }
       temp.next=head;
       tail=temp;
    }

    public void display(){
       if(head==null){
           System.out.println("no elemts present");
           return;
       }
       Node temp=head;
       do{
           System.out.print(temp.value+"->");
           temp=temp.next;
       }while (temp!=head);
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
