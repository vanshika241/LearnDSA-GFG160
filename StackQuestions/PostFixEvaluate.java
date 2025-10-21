package StackQuestions;
import java.util.*;
public class PostFixEvaluate {
    
     public int divide(int a , int b){
         int res = a/b;
         if(a%b != 0 && ((a<0) != (b<0))){
             res--;
         }
         return res;
     }
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            String token = arr[i];
            
            if(token.equals("+") || token.equals("-") || token.equals("*") ||token.equals("/") ||token.equals("^")){
                int b = s.pop();
                int a = s.pop();
                int ans = 0; 
                switch(token){
                    case "+":ans = a+b;break;
                    case "-":ans = a-b;break;
                    case "/":ans = divide(a,b);break;
                    case "*":ans = a*b;break;
                    case "^":ans = (int)Math.pow(a,b);break;
                }
                s.push(ans);
            }
            else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.peek();
    }
}
