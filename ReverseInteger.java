class ReverseInteger {
    public int reverse(int x) {
        int k = 0;
        while(x != 0){
            int p = x % 10;
            if (k > Integer.MAX_VALUE / 10) return 0;
            if (k < Integer.MIN_VALUE / 10) return 0;
            x /= 10;
            k = k * 10 + p;
        }
        return k;
    }
}
