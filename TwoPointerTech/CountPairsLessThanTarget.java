import java.util.Arrays;

public class CountPairsLessThanTarget {
        int countPairs(int arr[], int target) {
        int n = arr.length;
        Arrays.sort(arr);
        int i=0;
        int j = n-1;
        int cnt = 0;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum < target){
                cnt += j-i;
                i++;
            }
            else{
                j--;
            }
        }
        return cnt;
    }

}
