package Arrays;

public class LastMomentAllAntsFallOut {
    public int getLastMoment(int n, int left[], int right[]) {
        int maxiTime = 0;
        for(int num : left){
            maxiTime = Math.max(maxiTime, num);
        }
        for(int num:right){
            maxiTime = Math.max(maxiTime, n-num);
        }
        return maxiTime;

        //T.C = O(N)
        //S.C = O(1)
    }
}
