public class TrappingRainWater {
    public int maxWater(int arr[]) {
        int n = arr.length;
        int totalWater = 0;
        // for(int i=1;i<n;i++){
        //     int leftMax = arr[i];
        //     int rightMax = arr[i];
        //     for(int j=0;j<i;j++){
        //         leftMax = Math.max(leftMax , arr[j] );
        //     }
        //     for(int j=i+1;j<n;j++){
        //         rightMax = Math.max(rightMax , arr[j] );
        //     }
            
        //     totalWater += Math.min(leftMax, rightMax) - arr[i];
        // }
        // return totalWater;
         int leftMax  = 0;
        int rightMax = 0;
        int i = 0;
        int j = n-1;
        while(i<j){
            leftMax = Math.max(leftMax , arr[i]);
            rightMax = Math.max(rightMax , arr[j]);
            if(leftMax < rightMax){
                totalWater += leftMax-arr[i];
                i++;
            }
            else{
                totalWater += rightMax-arr[j];
                j--;
            }
        }
        return totalWater;
    }
}
