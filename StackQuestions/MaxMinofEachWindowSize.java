package StackQuestions;
import java.util.*;
public class MaxMinofEachWindowSize {
 public ArrayList<Integer> maxOfMins(int[] arr) {
        // code here
        int n = arr.length;
        int left[] = new int[n]; //index - Nearest smaller in left
        int right[] = new int[n]; // index - Nearest smaller in right
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                left[i] = -1;
            }
            else{
                left[i] = s.peek();
            }
            s.push(i);
        }
        
        s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
             if(s.isEmpty()){
                right[i] = n;
            }
            else{
                right[i] = s.peek();
            }
            s.push(i);
        }
        
        int len[] = new int[n];
        for(int i=0;i<n;i++){
            len[i] = right[i]-left[i]-1;
        }
        int ans[] = new int[n+1];
        for(int i=0;i<n;i++){
            int window = len[i];
            ans[window] = Math.max(ans[window],arr[i]);
        }
        
        for(int i=n-1;i>=1;i--){
            ans[i] = Math.max(ans[i],ans[i+1]);
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(ans[i+1]);
        }
        return res;
        
    }
    
}