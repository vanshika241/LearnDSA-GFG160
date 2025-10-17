import java.util.ArrayList;
import java.util.Arrays;

public class SumPairClosetTarget {
        public ArrayList<Integer> sumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if(n<=1)return ans;
        int el1 = -1;
        int el2 = -1;
        int i= 0;
        int j = n-1;
        int min = Integer.MAX_VALUE;
        while(i<j){
            int sum = arr[i]+arr[j];
            int diff = Math.abs(target - sum);
            if(diff < min){
                el1 = arr[i];
                el2 = arr[j];
                min = diff;
            }
            else if(diff == min && el2-el1 < arr[j]-arr[i] ){
                    el1 = arr[i];
                    el2 = arr[j];
            }
            if(sum > target){
                j--;
            }
            else{
                i++;
            }
        }
        
        ans.add(el1);
        ans.add(el2);
        return ans;
        
    }

}
