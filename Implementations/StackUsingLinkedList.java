package Implementations;
import java.util.*;

public class StackUsingLinkedList {

    public static class Node {
         int data;
         Node next;
         Node(int data){
            this.data = data;
            this.next = null;
         }
        
    }
    public static Node head = null;
    public static int size = 0;
    public  void push(int val){
        Node newNode = new Node(val);
        if (head == null) {
            size++;
            head = newNode;
            return;
        }
        else{
            size++;
            newNode.next = head;
            head = newNode;
        }

    }

    public  int pop(){
        if (size == 0) {
            return -1;
        }
        else if (size == 1) {
            int val = head.data;
            head = null;
            size--;
            return val;
        }
        else{
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
    }

    public  int peek(){
        if (size == 0) {
            return -1;
        }
        return head.data;
    }

    public  boolean isEmpty(){
        return size == 0;
    }
    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Size is "+size);
        while (!s.isEmpty()) {
            System.out.print(s.peek() +" ");
            s.pop();
        }
    }
}