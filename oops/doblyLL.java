package oops;

public class doblyLL {
    private Node head;
    private Node tail;
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void insertLast(int val){
        Node node=new Node(val);
        node.next=null;
        node.prev=tail;
        tail.next=node;
        if(tail==null){
            tail=head;
        }else {
            tail=node;
        }

    }
    public void displaylist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
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
