package StackQuestions;

import java.util.*;

public class NextGreaterElement {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        
        ans.add(1);
        s.push(0);
        
        for(int i=1;i<n;i++){

            int curr  = arr[i];
            while(!s.isEmpty() && arr[s.peek()]<=curr){
                s.pop();
            }
            if(s.isEmpty()){
                ans.add(i+1);
            }
            else{
                ans.add(i-s.peek());
            }
            s.push(i);
        }
        return ans;
    }
}
