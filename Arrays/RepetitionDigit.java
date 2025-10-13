package Arrays;

public class RepetitionDigit {
    public int singleDigit(int n) {
       int sum = 0;
       while (n>=10) {
         while (n>0) { // adding digits to sum
            sum += n%10;
            n /= 10;
         }
         n = sum;
         sum = 0; 
       }
       return n;

       // T.C = O(N)
       // S.C = O(1)
    }
}
