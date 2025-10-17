import java.util.Arrays;

public class ThreeClosetSum {
    public int closest3Sum(int[] arr, int target) {
        // code here
        int n = arr.length;
        if(n<3)return 0;
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n-2;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                int diff = Math.abs(target - sum);
                if(diff < minDiff || (diff == minDiff && sum > maxSum)){
                    minDiff = diff;   
                    maxSum = sum;
                }
                
                if(sum <target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return maxSum;
    }
}
