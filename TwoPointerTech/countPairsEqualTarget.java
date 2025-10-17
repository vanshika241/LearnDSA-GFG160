public class countPairsEqualTarget {
        int countPairs(int arr[], int target) {
        // Complete the function
        int n = arr.length;
        int i=0;
        int j = n-1;
        int cnt = 0;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum == target){
                if(arr[i] == arr[j]){
                    int len = j-i+1;
                    cnt += (len *(len-1))/2;
                    break;
                }
                else{
                    int leftCnt = 1;
                    int rightCnt = 1;
                    while(i<j && arr[i+1] == arr[i]){
                        leftCnt++;
                        i++;
                    }
                    while(i<j && arr[j-1] == arr[j]){
                        rightCnt++;
                        j--;
                    }
                    cnt += leftCnt* rightCnt;
                    i++;
                    j--;
                }
                
            }
            else if(sum > target){
                j--;
            }
            else{
                i++;
            }
        }
        return cnt;
    }

}
