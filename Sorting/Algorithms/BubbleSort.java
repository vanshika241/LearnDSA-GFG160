class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean check = false;
            for(int j=1;j<=n-1-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    check = true;
                }
            }
            if(check == false)return;
        }
    }
}
