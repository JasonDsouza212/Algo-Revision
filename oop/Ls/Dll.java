package oop.Ls;

public class Dll {
    private Node head;
    private Node tail;
    private int size;
    Dll(){
        head=null;
        tail=null;
        size=0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
       if(head!=null){
           head.prev=node;
       }
        if(head==null){
           tail=node;
        }
        head=node;
        size++;
    }
    public void insertLast(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node node =new Node(val);
        node.next=null;
        node.prev=tail;
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertIndex(int ind,int value){
        if(ind<0||ind>size+1){
            System.out.println("you cannot insert at this "+ind+" position");
            return;
        }
        Node node=new Node(value);

        Node temp=head;
        for(int i=1;i<ind;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        node.prev=node.next.prev;
        node.next.prev=node;
        size++;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void printrev(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.prev;
        }
        System.out.println("Start");
    }
    private class Node{
        private int value;
        private Node next;
        private Node prev;
        Node(int value){
            this.value=value;
        }


        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
