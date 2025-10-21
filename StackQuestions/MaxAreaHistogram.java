package StackQuestions;
import java.util.*;


public class MaxAreaHistogram {
    public static int getMaxArea(int arr[]) {
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
        int maxi = 0;
        for(int i=0;i<n;i++){
            int width = right[i]-left[i]-1;
            int height = arr[i];
            maxi = Math.max(maxi , height * width);
        }
        return maxi;
    }
}
