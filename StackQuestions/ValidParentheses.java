package StackQuestions;
import java.util.*;
public class ValidParentheses {
    public boolean isBalanced(String s) {
        // code here
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                  if((ch == ')' && st.peek() == '(') || (ch == '}' && st.peek() == '{') || (ch == ']' && st.peek() == '[')){
                       st.pop();
                  }  
                  else{
                      return false;
                  }
                }
            }
        }
        return st.isEmpty() ? true : false;
    }
}
