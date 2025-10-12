package Arrays;

public class RotateArray {
        public static void reverse(int arr[] , int i , int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotateArr(int arr[], int d) {
        int n = arr.length; 
        d = d % n ; // [ 0 to n-1]
        if(d == 0)return;
        reverse(arr, 0, d-1);
        reverse(arr , d , n-1);
        reverse(arr, 0 , n-1);
        
        //T.C = O(N)
        // S.C = O(1)
        
    }

}
