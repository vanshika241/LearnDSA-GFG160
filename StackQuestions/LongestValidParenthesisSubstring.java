package StackQuestions;
import java.util.*;


public class LongestValidParenthesisSubstring {
    static int maxLength(String s) {
        // code here
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && (ch == ')' && s.charAt(st.peek()) == '(')){
                st.pop();
            }
            else st.push(i);
        }
        
        int maxlen = 0;
        int idx = 0;
        for(int i : st){
            maxlen = Math.max(maxlen , i-idx);
            idx = i+1;
        }
        maxlen  = Math.max(maxlen , n-idx);
        return maxlen;
    }
}
