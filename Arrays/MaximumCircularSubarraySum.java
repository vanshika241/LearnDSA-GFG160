package Arrays;

public class MaximumCircularSubarraySum {

    public int kadanesMin(int arr[]){
        int n = arr.length;
        int sum = arr[0];
        int mini = arr[0];
        for(int i=1;i<n;i++){
            sum = Math.min(mini + arr[i], arr[i]);
            mini = Math.min(mini, sum);
        }
        return mini;
    }

    public int kadanesMax(int arr[]){
        int n = arr.length;
        int sum = arr[0];
        int maxi = arr[0];
        for(int i=1;i<n;i++){
            sum = Math.max(maxi + arr[i], arr[i]);
            maxi = Math.max(maxi, sum);
        }
        return maxi;
    }

    public int maxCircularSum(int arr[]) {
       
        // int maxiSum = Integer.MIN_VALUE;
       // int n = arr.length;
        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=0;j<n;j++){
        //         int idx = (i+j)%n; // get index after n-1 also 
        //         sum += arr[idx]; // find all subarrays
        //         maxiSum = Math.max(maxiSum, sum);
        //     }
        // }

        int tsum = 0;
        for(int num : arr)tsum += num;
        int maxiS = kadanesMax(arr);
        int miniS = kadanesMin(arr);
        if (maxiS <0) {
            return maxiS;
        }


        return Math.max(tsum - miniS, maxiS);
        //T.C = O(N)
        //S.C = O(1)
    }
}
