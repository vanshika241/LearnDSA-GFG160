class Solution {
    
    public static int merge(int arr[] , int l , int m ,  int h){
        int left = l;
        int right = m+1;
        int cnt = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(left <= m && right <= h){
            if(arr[left]<=arr[right]){
                ans.add(arr[left]);
                left++;
            }
            else{
                ans.add(arr[right]);
                cnt += m-left+1;
                right++;
            }
        }
        
        while(left <= m){
            ans.add(arr[left]);
                left++;
        }
        while(right<=h){
                ans.add(arr[right]);
                right++;
        }
        
        for(int i=l;i<=h;i++){
            arr[i] = ans.get(i-l);
        }
        return cnt;
    }
    public static  int mergeSort(int arr[] , int l , int h){
        if(l >= h)return 0;
        int cnt = 0;
        int mid = l + (h-l)/2;
        cnt += mergeSort(arr , l , mid);
        cnt += mergeSort(arr , mid+1 , h);
        cnt += merge(arr , l ,  mid , h);
        return cnt;
        
        
    }
    static int inversionCount(int arr[]) {
        // Code Here
      return  mergeSort(arr , 0 , arr.length-1);
    }
}
