public class ContainerWithMostWater {
        public int maxWater(int arr[]) {
        // Code Here
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int maxWater = 0;
        while(i<j){
            if(arr[i]<arr[j]){
                maxWater = Math.max(maxWater , arr[i]*(j-i));
                i++;
            }
            else{
                maxWater = Math.max(maxWater , arr[j]*(j-i));
                j--;
            }
        }
        return maxWater;
    }

}
