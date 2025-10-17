import java.util.ArrayList;
import java.util.Arrays;

public class AllQuadRuple {
     public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
        int n = arr.length;
        ArrayList<ArrayList<Integer>>  ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n-3;i++){
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            for(int j = i+1;j<n-2;j++){
                if(j>i+1 && arr[j] == arr[j-1]){
                continue;
               }
                int k = j+1;
                int l = n-1;
                while(k<l){
                    int sum = arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum == target){
                        ArrayList<Integer> curr = new ArrayList<>();
                        curr.add(arr[i]);
                        curr.add(arr[j]);
                        curr.add(arr[k]);
                        curr.add(arr[l]);
                        ans.add(curr);
                        while(k<l && arr[k+1] == arr[k]){
                            k++;
                        }
                        while(k<l && arr[l-1] == arr[l]){
                            l--;
                        }
                        k++;
                        l--;
                    }
                    else if(sum <target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}
