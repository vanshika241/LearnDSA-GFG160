import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsWindowK {
    ArrayList<Integer> countDistinct(int arr[], int k) {
       int n = arr.length;
       int i=0;
       int j= 0;
       HashMap<Integer,Integer> mp = new HashMap<>();
       ArrayList<Integer> ans = new ArrayList<>();
       while(j<n){
           mp.put(arr[j] , mp.getOrDefault(arr[j],0)+1);
           while(j-i+1 > k){
               mp.put(arr[i] , mp.get(arr[i])-1);
               if(mp.get(arr[i])== 0)mp.remove(arr[i]);
               i++;
           }
           if(j-i+1 == k){
               ans.add(mp.size());
           }
           j++;
           
       }
       return ans;
    }
}
