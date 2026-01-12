class ReverseInt_7 {
    public int reverseInteger(int n) {
        int result = 0;
        while (n != 0) {
            int remain = n%10;
            if (result > Integer.MAX_VALUE/10 || result < Integer.MIN_VALUE/10) return 0;
            result = (result * 10) + remain;
            n=n/10;
        }
        return result;  
    }    
}
