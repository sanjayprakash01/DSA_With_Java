import java.util.HashSet;
import java.util.Set;

class LongestSubstring_3 {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLen = 0;
        Set<Character> seen = new HashSet<>();
        while (end < s.length()) {
            while (seen.contains(s.charAt(end))) {
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(s.charAt(end));
            maxLen = Math.max(maxLen, end - start);
            end++;
        }
        
        return maxLen;   
    }
}
