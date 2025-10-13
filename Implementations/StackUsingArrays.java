package Implementations;

public class StackUsingArrays {

    public static class Stack {
        int arr[];
        int idx = -1;
        int size;
        Stack(int size){
            this.arr = new int[size];
            this.size = size;
        }

    
    public boolean isEmpty(){
        return idx == -1;
    }

    private boolean isFull(){
        return idx == size-1;
    }

    private void push(int data){
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        idx++;
        arr[idx] = data;
    }

    private int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty. Nothing to remove");
            return -1;
        }
        int val = arr[idx];
        arr[idx] = 0;
        idx--;
        return val;

    }

    private int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty. Nothing to remove");
            return -1;
        }
        return arr[idx];

    }


    }
    public static void main(String[] args) {
        Stack s = new Stack(5);
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.isFull());
        s.push(6);
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
        

    }

}
