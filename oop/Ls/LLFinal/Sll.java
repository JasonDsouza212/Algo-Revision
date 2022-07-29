package oop.Ls.LLFinal;

public class Sll {
    private int size=0;
    public static Node head;
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
            return;
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

    public void recIns(int index,int val){
        if(index<0 || index>size){
            System.out.println("You Cannot insert at "+index+" position");
            return;
        }
        head=rec(index,val,head);
        if(tail==null){
            tail=head;
        }
    }
    private Node rec(int ind,int val,Node node){
        if(ind==0){
            Node temp=new Node(val);
            temp.next=node;
            size++;
            return temp;
        }
        node.next=rec(ind-1,val,node.next);
        return node;
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

      Node(){

      }

       public Node(int value) {

           this.value = value;
       }

       public Node(int value, Node next) {
           this.value = value;
           this.next = next;
       }
   }


//   #===========================================================================================================================
public Node sortList(Node head) {
    if(head ==null || head.next == null){
        return head;
    }
    Node mid=middleNode(head);
    Node right= sortList(head);
    mid.next=null;
    Node left= sortList(mid);


    return mergeTwoLists(left,right);
}
    Node mergeTwoLists(Node list1, Node list2){
        Node head=new Node();
       Node tail=head;
        while(list1 !=null &&list2 !=null){
            if(list1.value<list2.value){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        while(list1!=null){
            tail.next=list1;
            list1=list1.next;
            tail=tail.next;
        }
        while(list2!=null){
            tail.next=list2;
            list2=list2.next;
            tail=tail.next;
        }
        return head.next;
    }
    Node middleNode(Node head){
         Node fakemid=null;
        while(head!=null && head.next!=null){
            if(fakemid==null){
                fakemid=head;
            }else{
                fakemid=fakemid.next;
            }

            head=head.next.next;
        }
        Node mid=fakemid.next;
        fakemid.next=null;
        return mid;
    }

    public static void main(String[] args) {
        Sll list=new Sll();
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
//        sortList(list);
        list.display();
    }


}
