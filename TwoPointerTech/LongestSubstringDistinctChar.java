import java.util.HashMap;

public class LongestSubstringDistinctChar {
    public int longestUniqueSubstr(String s) {
        // code here
        int maxlen = 0;
        int n = s.length();
        HashMap<Character,Integer> mp = new HashMap<>();
        int len = 0;
        int i=0;
        int j = 0;
        while(j<n){
            mp.put(s.charAt(j) , mp.getOrDefault(s.charAt(j),0)+1);
            while(j-i+1 !=  mp.size()){
                mp.put(s.charAt(i) , mp.get(s.charAt(i))-1);
                if(mp.get(s.charAt(i)) == 0){
                    mp.remove(s.charAt(i));
                }
                i++;
            }
            
            if(j-i+1 == mp.size()){
                len = j-i+1;
                maxlen = Math.max(maxlen , len);
            }
            j++;
            
        }
        return maxlen;
    }
}
