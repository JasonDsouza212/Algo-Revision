package oops;

public class Ls {
    private Node tail;
    private Node head;
    private int size;

    public void deleteFirst(){
        System.out.println(head.value);
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;


    }
    public void deleteLast(){
   if(size<=1){
        deleteFirst();
   }
        System.out.println(tail.value);
        Node SecondLast=get(size-2);
       tail=SecondLast;
       tail.next=null;

    }
    public void deleteIndex(int ind){
        if(ind==0){
            deleteFirst();
        }
        if(ind==size-1){
            deleteLast();
        }
        Node prev=get(ind-1);
        int val=prev.next.value;
        System.out.println(val);
        prev.next=prev.next.next;
    }
    public void find(int val){

    }
    public Node get(int ind){
        Node node=head;
        for(int i=0;i<ind;i++){
            node=node.next;
        }
        return node;
    }
     public void index(int val,int ind){
         if(ind==0){
              insertFirst(val);
              return;
         }
         if(ind==size){
           addLast(val);
           return;
         }

         Node temp=head;
         for(int i=1;i<ind;i++){
             temp=temp.next;
         }
         Node node=new Node(val,temp.next);
         temp.next=node;
        size++;
     }
   public Ls(){
        this.size=0;
    }
    public void addLast(int value){
       if(tail==null){
           insertFirst(value);
           return;
       }
      Node node=new Node(value);
      tail.next=node;
      tail=node;
      size++;
    }

    public void display(){
       Node temp=head;
       while(temp!=null){
           System.out.print(temp.value+"->");
           temp=temp.next;
       }
        System.out.println("END");
    }

    public void insertFirst(int value){
       Node node=new Node(value);
       node.next=head;
       head=node;

       if(tail==null){
           tail=head;
       }
       size++;

    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
