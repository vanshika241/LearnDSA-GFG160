package Arrays;

public class MoveZerosToEnd {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = -1;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                j = -1;
                break; // because i need only first zero element index
            }
        }
        if(j == -1)return; // no zero in array - No need to do anything
        for(int i=j+1;i<n;i++){ // zero present so we just swap 
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        //Time complexity - O(n)
        //Space complexity - O(1)
    }
}

