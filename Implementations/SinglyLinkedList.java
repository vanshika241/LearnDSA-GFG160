package Implementations;

public class SinglyLinkedList {
    private static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
        
    }

    private static Node head = null;
    private static int size = 0;

    public  void addFirst(int value){
      Node newNode = new Node(value);
      if(size == 0 ){
        head = newNode;
        size++;
        return;
      }
      else{
        newNode.next = head;
        head = newNode;
        size++;
      }
    }

    public  void addLast(int value){
      Node newNode = new Node(value);
      if(size == 0 ){
        head = newNode;
        size++;
        return;
      }
      else{
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        size++;
        temp.next = newNode;
      }

    }

    public  void addAtAnyIndex(int value , int idx){
        if (idx == 0) {
            addFirst(value);
            return;
        }
        else{
            int i=0;
            Node temp = head;
            while (i < idx-1) {
                temp = temp.next;
                i++;
            }
            size++;
            Node newNode = new Node(value);
            Node next = temp.next;
            newNode.next = next;
            temp.next = newNode;

        }
    }

    public  int removeFirst(){
        if (size == 0) {
            System.out.println("LL is Empty");
            return -1;
        }
        else{
            int res = head.val;
            head = head.next;
            size--;
            return res;
        }
    }

    public  int removeLast(){
        if (size == 0) {
            System.out.println("LL is Empty");
            return -1;
        }
        if (head.next == null) {
            int res = head.val;
            size--;
            head = null;
            return res;
        }
        else{
           Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        size--;
        int res = temp.next.val;
        temp.next = null;
        return res;
        
        }
    }

    public  int removeAtAnyIndex(int idx){
        if (idx == 0) {
           return removeFirst();
        }
        else{
            int i=0;
            Node temp = head;
            while (i < idx-1) {
                temp = temp.next;
                i++;
            }
            size--;
            int res = temp.next.val;
            temp.next = temp.next.next;
            return res;
        }
    }

    public  void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        list.addAtAnyIndex(10, 3);
        list.removeFirst();
        list.removeLast();
        list.removeAtAnyIndex(2);
        System.out.println("Size is " + size);
        list.display();

    }


}
