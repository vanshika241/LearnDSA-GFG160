public class MinOperationsToRemove{
    public int minRemovals(int[] arr, int k) {
        // code here
        int n = arr.length;
        int tsum = 0;
        for(int num:arr)tsum += num;
        int target = tsum - k; // itne array mai hone chahiye
        if(target == 0)return n;
        int i = 0;
        int j = 0;
        int sum = 0;
        int len = -1;
        while(j<n){
            sum += arr[j];
            while(sum > target){
                sum -= arr[i];
                i++;
            }
            if(sum == target){
                len = Math.max(len , j-i+1);
            }
            j++;
        }
        return len != -1 ? n-len : -1;
        
    }
}