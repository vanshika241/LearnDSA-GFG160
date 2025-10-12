package Arrays;

public class ReverseArray {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        int start = 0; // first 
        int end =  n-1; // last 
        while (start < end) { // till equal - valid condition
            int temp = arr[start]; // swap
            arr[start] = arr[end];
            arr[end] = temp;
            start++; // move the indexes
            end--;
        }


        //T.C = O(N)
        //S.C = O(1)
    }
}
