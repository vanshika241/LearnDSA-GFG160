class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low>=high)return;
        int pivotIdx = partition(arr , low, high);
        quickSort(arr , low, pivotIdx-1);
        quickSort(arr , pivotIdx+1 , high);
        
        
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int i =low; 
        int j = high;
        int pivot = arr[low];
        
        while(i<=j){
            while(i<=high && arr[i]<=pivot)i++;
            while(j>=low  && arr[j]> pivot)j--;
            
            if(i<j){
                int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
        }
        
        int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
            
        return j;
        
    }
}
