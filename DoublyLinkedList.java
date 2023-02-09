
public class DoublyLinkedList {



    private static class ListNode{//ListNode class
        private int data;
        private ListNode next;
        private ListNode prev;
        public ListNode(int data){
            this.data=data;
        }//ListNode constructor for building
    }
    private ListNode head;
    private ListNode tail;
    private int length;//length of doubly linked list

    public DoublyLinkedList(){//Doubly Linked List constructor for building
        this.head=null;
        this.length=0;
        this.tail=null;
    }

    public boolean isEmpty(){
        return(length==0);
    }//Returns true if the list is Empty

    public void addFirst(int data){//adding element to the first of the list
        ListNode newNode = new ListNode(data);
      newNode.next=null;
      newNode.prev=null;
      if(isEmpty()){
          head=newNode;
          tail=head;
          length++;
          return;
      }
          head.prev = newNode;
          newNode.next = head;
          head = newNode;
          length++;


    }

    public void display(){//works
        ListNode temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.print("Length:"+length);
    }


}
