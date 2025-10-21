package StackQuestions;
import java.util.*;
public class MaxStack {
    public class Pair{
        int curr;
        int max;
        Pair(int curr , int max){
            this.curr = curr;
            this.max = max;
        }
    }
    Stack <Pair> s;
    public MaxStack() {
        s = new Stack<>();
        
    }

    public void push(int x) {
        if(s.isEmpty()){
            s.push(new Pair(x,x));
        }
        else{
            int prevMax = s.peek().max;
            if(x < prevMax ){
                 s.push(new Pair(x,prevMax));
            }
            else{
                 s.push(new Pair(x,x));
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

    public int getMax() {
        // Finds minimum element of Stack
        if(s.isEmpty()){
            return -1;
        }

        return s.peek().max;
    }
}
