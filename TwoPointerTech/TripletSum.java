 import java.util.*;
 public class TripletSum{
        public boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum == target){
                    return true;
                }
                else if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return false;
    }

 }