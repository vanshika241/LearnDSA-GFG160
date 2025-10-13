package Arrays;

public class MaximumNumber1s {
    public int maxOnes(int arr[], int k) {
        //Sliding window
        int i =0;
        int j = 0;
        int n = arr.length;
        int zeros = 0; // we just count zeros no need to flip completely
        int len = 0;
        while(j<n){
            if(arr[j] == 0)zeros++;
            while(zeros>k){
                if(arr[i] == 0)zeros--;
                i++;
            }
            len = Math.max(len , j-i+1); // maxlen
            j++;
        }
        return len;
        
        //T.C = O(N)
        // S.C = O(1)
        
    }
}
