package oop.Ls.LLFinal;

public class Dll {
    private Node head;
    private Node tail;
    private int size;

    public void insertStart(int val){
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

    public void insertEnd(int val){
        if(head==null){
            insertStart(val);
            return;
        }
        Node node =new Node(val);
        tail.next=node;
        node.prev=tail;
        node.next=null;
        tail=node;
        size++;
    }

    public void insertIndex(int index,int val){
        if(index<0 || index>size){
            System.out.println("You Cannot insert at "+index+" position");
            return;
        }
        if(index==0){
            insertStart(val);
            return;
        }
        if(index==size){
            insertEnd(val);
            return;
        }

        Node node =new Node(val);
        Node temp=ind(index);
        node.next=temp.next;
        node.prev=temp;
        temp.next.prev=node;
        temp.next=node;
        size++;

    }

    public void deleteStart(){
        if(head==null){
            System.out.println("No elements to delete");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            size--;
            return;

        }
        head=head.next;
        head.prev=null;
        size--;
    }
    public void deleteEnd(){
        if(head==null){
            System.out.println("No elements to delete");
            return;
        }
        if(head==tail){
            deleteStart();
            return;
        }
        tail=tail.prev;
        tail.next=null;
          size--;
    }

    public void deleteIndex(int index){
        if(index<0 || index>=size){
            System.out.println("You Cannot insert at "+index+" position");
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
        Node temp=ind(index);
        temp.next=temp.next.next;
        temp.next.prev=temp;
        size--;
    }

    public Node ind(int index){
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void display(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.value+"->");
            temp= temp.next;
        }
        System.out.println("END");

    }
    public void printrev(){
        Node temp=tail;
        while(temp !=null){
            System.out.print(temp.value+"->");
            temp= temp.prev;
        }
        System.out.println("START");
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
