class Solution {
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int ans = 0;
        int n = citations.length;
        for(int i=0;i<n;i++){
            int h = n-i;
            int citn = citations[i];
            if(citn >=h){
                ans = Math.max(ans , h);
            }
        }
        return ans;
    }
}
