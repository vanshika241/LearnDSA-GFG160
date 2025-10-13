package Arrays;

import java.util.*;

public class SplitSumThreeEqualParts {

    public List<Integer> findSplit(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        int tsum = 0;
        for(int num : arr)tsum += num;
        if (tsum %3 != 0) { // it never be possible to divide by 3 
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        int findSum = tsum/3; // it may or may not split
        int sum = 0;
        int cnt = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if (sum == findSum) {
                ans.add(i);
                cnt++;
                sum = 0;
                if (cnt == 2 && i<n-1) { // it means remaining is third 
                    return ans;
                }
            }
        }
        ans.add(-1);
        ans.add(-1);
        return ans;


        //T.C = O(N)
        //S.C = O(1)
    }

}