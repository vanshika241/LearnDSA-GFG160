package StackQuestions;

import java.util.*;

public class StockSpanProblem {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                ans.add(i+1);
            }
            else ans.add(i-s.peek());
            
            s.push(i);
        }
        return ans;
    }
}
