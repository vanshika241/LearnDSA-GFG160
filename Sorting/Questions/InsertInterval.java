class Solution {
    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]>  ans = new ArrayList<>();
        int newS = newInterval[0];
        int newE = newInterval[1];
        int i=0;
        int n = intervals.length;
        while(i<n && intervals[i][1] < newS ){
            ans.add(intervals[i]);
            i++;
        }
        
         while(i < n && intervals[i][0] <= newE){
             newS = Math.min(newS , intervals[i][0]);
             newE = Math.max(newE , intervals[i][1]);
             i++;
         }
         
         ans.add(new int[]{newS, newE});
         
        while(i<n ){
            ans.add(intervals[i]);
             i++;
        }
        
        return ans;
        
    }
    
}
