import java.util.ArrayList;

public class IndexesSubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int sum = 0;
        int i = 0;
        int j = 0;
        while(j<n){
            sum += arr[j];
            while( sum > target){
                sum -= arr[i];
                i++;
            }
            if(sum == target){
                ans.add(i+1);
                ans.add(j+1);
                return ans;
            }
            j++;
        }
        ans.add(-1);
        return ans;
    }
}
