class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
           for(int j=i+1;j>0;j--){
               if(arr[j]<arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
               }
               else{
                   break;
               }
           }
        }
    }
}
