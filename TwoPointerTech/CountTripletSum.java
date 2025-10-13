
public class CountTripletSum {

    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n = arr.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum == target){
                    
                    if(arr[j] == arr[k]){ // count all combinations
                        int len = k-j+1;
                        cnt += (len*(len-1))/2;
                        break;
                    }
                    int leftCnt = 1;
                    int rightCnt = 1;
                    while(j<k && arr[j+1] == arr[j]){ // handling duplicates
                        j++;
                        leftCnt++;
                    }
                    while(k>j && arr[k-1] == arr[k]){
                        k--;
                        rightCnt++;
                    }
                    cnt += leftCnt * rightCnt;
                    j++;
                    k--;
                }
                else if(sum < target){ // if else increase j
                    j++;
                }
                else{ // else decrease j 
                    k--;
                }
            }
        }
        return cnt;
    }
}