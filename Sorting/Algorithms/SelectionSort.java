class Solution {
    
    public int getMax(int arr[], int start , int end){
        int maxi = start;
        for(int i=start ;i<=end;i++){
            if(arr[i]>arr[maxi]){
                maxi = i;
            }
        }
        return maxi;
    }
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0;i<n;i++){
            int last = n-1-i;
            int max = getMax(arr, 0, last);
            if(arr[max] != arr[last]){
                int temp = arr[max];
                arr[max] = arr[last];
                arr[last] = temp;
            }
        }
        
    }
}
