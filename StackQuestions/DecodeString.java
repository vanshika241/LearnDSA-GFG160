package StackQuestions;
import java.util.*;
public class DecodeString {

    static String decodeString(String s) {
        // code here
        int n = s.length();
        String currStr = "";
        int currNum = 0;
        Stack<String> str = new Stack<>();
        Stack<Integer> num = new Stack<>();
        String prevStr = "";
        int prevNum = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                currNum = currNum*10 + (ch-'0');
            }
            else if(ch == '['){
                str.push(currStr);
                num.push(currNum);
                prevStr = currStr;
                prevNum = currNum;
                currStr = "";
                currNum = 0;
                
            }
            else if(ch == ']'){
                prevStr = str.pop();
                prevNum = num.pop();
                StringBuilder temp = new StringBuilder(prevStr);
                while(prevNum >0){
                    temp.append(currStr);
                    prevNum--;
                }
                currStr = temp.toString();
            }
            else{
                currStr += ch;
            }
            
        }
        return currStr;
    }
}