package Arrays;

public class kadanesAlgo {
        int maxSubarraySum(int[] arr) {
       int n = arr.length;
       int sum = arr[0]; 
       int maxi = arr[0];
       for(int i=1;i<n;i++){
           sum = Math.max(sum+arr[i],arr[i]); //either sum with prev elements or we start a new subarray from curr element
           maxi = Math.max(maxi , sum);
       }
       return maxi;

       //T.C = O(N)
       //S.C = O(N)
    }

}
