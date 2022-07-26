package oop.Ls;

public class Sll {
    private Node head;
    private Node tail;
    private int size;

    Sll(){
        head=null;
        tail=null;
        size=0;
    }
    public void insertFirts(int value){
      Node node=new Node(value);
      node.next=head;
      head=node;
      size++;
        if(tail==null){
            tail=head;
        }
    }
    public void insertlast(int value){
     if(tail==null){
         insertFirts(value);
         return;
     }
     Node node=new Node(value);
     tail.next=node;
     tail=node;
     size++;

    }
    public void indexInsert(int index,int value){
        if(index<0||index>size+1){
            System.out.println("you cannot insert at this "+index+" position");
            return;
        }
        if(head==null){
            insertFirts(value);
            return;
        }
        Node ind=head;
        for(int i=1;i<index;i++){
            ind=ind.next;
        }
        Node node=new Node(value);
        Node temp=ind.next;
        ind.next=node;
        node.next=temp;
        size++;

    }
    public void deleteStart(){
        head=head.next;
        size--;
    }
    public void deleteEnd(){
        if(head==null){
            System.out.println("No elements to remove");
            return;
        }
        Node temp=head;
        for(int i=0;i<size-1;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }
    public void deleteIndex(int ind){
        if(ind<0||ind>size+1){
            System.out.println("you cannot Delete at this "+ind+" position");
            return;
        }
        Node node=head;
        for(int i=0;i<ind-1;i++){
            node=node.next;
        }
        if(node==head){
            deleteStart();
            return;
        }
        if(node==tail){
            deleteEnd();
            return;
        }

        node.next=node.next.next;
        size--;
    }
    public void findValue(int val){
        if(head==null){
            System.out.println("No elements to find");
            return;
        }
        Node node=head;
        while(node!=null){
            if(node.value==val){
                System.out.println(val+"Value found");
                return;
            }
            node=node.next;
        }

        if(node==null){
            System.out.println("No Value Found");
            return;
        }
        System.out.println("Value not found");

    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }
     private class Node{
         private int value;
         private Node next;
         Node(int value){
             this.value=value;
         }

         public Node(int value, Node next) {
             this.value = value;
             this.next = next;
         }
     }
}
