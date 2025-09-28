class Solution {


    public void merge(int arr[], int l, int mid ,  int r){
        int left = l;
        int right = mid+1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(left<=mid && right <=r){
            if(arr[left]<=arr[right]){
                ans.add(arr[left]);
                left++;
            }
            else{
                ans.add(arr[right]);
                right++;
            }
        }
        
        while(left<=mid){
            ans.add(arr[left]);
                left++;
        }
        
        while(right<=r){
            ans.add(arr[right]);
                right++;
        }
        
        for(int i = l;i<=r;i++){
            arr[i] = ans.get(i-l);
        }
    }
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return;
        }
        int mid  = l +(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        merge(arr, l , mid, r);
        return;
        
    }
}
