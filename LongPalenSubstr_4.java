class LongPalenSubstr_4 {
    public String longestPalendromicSubStr(String s) {//babad
        if (s.length() <= 1) {
            return s;
        }
        int maxLen = 1;
        String str = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = maxLen + 1; j <= s.length(); j++) {
                if (j - i > maxLen && isPalendrome(s.substring(i, j))) {
                    str = s.substring(i, j);
                    maxLen = j - i;
                }
            }
        }
        return str;
    }
    public boolean isPalendrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
