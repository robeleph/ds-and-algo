class CountBits {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i = 0; i <= n; i++) {
            int bitCount = countBit(i);
            result[i] = bitCount;
        }
        return result;
    }
    public int countBit(int num) {
        int count = 0;
        if (num == 0) return 0;
        while(num > 0) {
            if (num % 2 != 0) {
                count++;
            }
            num = num / 2;
        }
        return count;
    }
}
