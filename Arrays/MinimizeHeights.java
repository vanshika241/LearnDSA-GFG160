package Arrays;
import java.util.*;

public class MinimizeHeights {
    public int getMinDiff(int[] arr, int k) {
       Arrays.sort(arr);
       int n = arr.length;
       int min = arr[0];
       int max = arr[n-1];
       int diff = max-min;
       for(int i=1;i<n;i++){
          min = Math.min(arr[i]-k, arr[0]+k);
          max = Math.max(arr[i-1]+k, arr[n-1]-k); //we want as close as possible
          diff = Math.min(diff, max-min);
       }
       return diff;
    }
}
