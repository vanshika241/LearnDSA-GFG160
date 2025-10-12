package Arrays;

public class SecondLargest {
        public int getSecondLargest(int[] arr) {
             int n = arr.length; // total number of elements in an array 
             int maxi = arr[0]; // consider it as first largest element 
             int smaxi = -1; // else Integer.MIN_VALUE - smallest value - minus infinity
             for(int i=1;i<n;i++){
                if(arr[i]>maxi){ //35 
                    smaxi = maxi; // obviously now the second is prev maxi 
                    maxi = arr[i]; // updated maxi 
                }
                if(arr[i]<maxi && arr[i]>smaxi){ // 34 
                    smaxi = arr[i]; 
                }
             }
             return smaxi;

             //Time complexity = O(n)
             // Space complexity - O(1)
        }
}
