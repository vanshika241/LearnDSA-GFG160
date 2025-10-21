package StackQuestions;
import java.util.*;

public class MinStack {
    public class Pair{
        int curr;
        int min;
        Pair(int curr , int min){
            this.curr = curr;
            this.min = min;
        }
    }
    Stack <Pair> s;
    public MinStack() {
        s = new Stack<>();
        
    }

    public void push(int x) {
        if(s.isEmpty()){
            s.push(new Pair(x,x));
        }
        else{
            int prevMin = s.peek().min;
            if(x < prevMin ){
                 s.push(new Pair(x,x));
            }
            else{
                 s.push(new Pair(x,prevMin));
            }
        }
    }

    public void pop() {
        // Remove the top element from the Stack
        if(s.isEmpty()){
            return;
        }
        else s.pop();
    }

    public int peek() {
        // Returns top element of the Stack
        if(s.isEmpty()){
            return -1;
        }
        return  s.peek().curr;
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return s.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(s.isEmpty()){
            return -1;
        }

        return s.peek().min;
    }
}
