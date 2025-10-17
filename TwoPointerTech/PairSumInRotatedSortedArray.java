public class PairSumInRotatedSortedArray {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        int n = arr.length;
        int i = -1;
        int j = -1;
        for(int id=1;id<n;id++){
            if(arr[id]<arr[id-1]){
                i = id;
                j = id-1;
                break;
            }
        }
        if( i == -1){
            i = 0;
            j = n-1;
        }
        while(i !=j){
            int sum = arr[i]+arr[j];
            if(sum == target){
                return true;
            }
            else if(sum > target){
                j = (n+j-1)%n;
            }
            else{
                i = (i+1)%n;
            }
        }
        return false;
    }
}
