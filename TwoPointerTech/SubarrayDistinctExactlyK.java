import java.util.HashMap;

public class SubarrayDistinctExactlyK {
      static int atMostK(int arr[] , int k){
        int n = arr.length;
        int i = 0;
        int j = 0;
        int cnt = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        while(j<n){
            mp.put(arr[j] , mp.getOrDefault(arr[j] , 0)+1);
            while(mp.size()>k){
                mp.put(arr[i] , mp.get(arr[i])-1);
                if(mp.get(arr[i]) == 0)mp.remove(arr[i]);
                i++;
            }
            cnt += j-i+1;
            j++;
        }
        return cnt;
    }
    static int exactlyK(int arr[], int k) {
        return atMostK(arr, k)-atMostK(arr ,k-1);
        
    }
}
