package Arrays;

import java.util.*;

public class MajorityElement2 {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        //Moore voting algorithm - it gives max occur element
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0;i<n;i++){
            if (cnt1 == 0 && arr[i] != el2) {
                el1 = arr[i];
                cnt1  = 1;
            }
            else  if (cnt2 == 0 && arr[i] != el1) {
                el2 = arr[i];
                cnt2 = 1;
            }
            else if (arr[i] == el1) {
                cnt1++;
            }
            else if (arr[i] == el2) {
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        //Verify - for n/3 case
        cnt1 = 0;
        cnt2 = 0;
        for(int num:arr){
            if(num == el1)cnt1++;
            if (num == el2)cnt2++;
        }
        ArrayList<Integer> res = new ArrayList<>();
        if (cnt1 > n/3) {
            res.add(el1);
        }
        if (cnt2 > n/3) {
            res.add(el2);
        } 
        Collections.sort(res); // inbuilt method to sort the ArrayList in increasing order
        return res;
    }

}
