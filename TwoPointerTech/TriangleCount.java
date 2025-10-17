import java.util.Arrays;

public class TriangleCount {
    public int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        if(n<=2)return 0;
        int cnt = 0;
        for(int j=n-1;j>=2;j--){
            int i=0;
            int k = j-1;
            while(i<k){
               if(arr[i]+arr[k]>arr[j]){
                   cnt += k-i;
                   k--;
               }
               else{
                   i++;
               }
            }
        }
        return cnt;
    }
}
