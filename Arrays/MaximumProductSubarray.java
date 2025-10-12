package Arrays;

public class MaximumProductSubarray {
    int maxProduct(int[] arr) {
        int n = arr.length;
        int prefix = 1; // calculated from start
        int suffix = 1; // calculated from last 
        int maxi = 1;
        for(int i=0;i<n;i++){
            if(prefix == 0)prefix =1;
            if(suffix == 0)suffix = 1;
            prefix *= arr[i];
            suffix *= arr[n-1-i];
            maxi = Math.max(maxi, Math.max(prefix, suffix));
        }
        return maxi;
        // T.C = O(N)
        //S.C = O(1)
    }
}
