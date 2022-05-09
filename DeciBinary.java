class DeciBinary {
    public int minPartitions(String n) {
        int ans = 0;
        int[] ch = new int[n.length()];
        for (int i = 0; i < n.length(); i++) {
            ch[i] = n.charAt(i) - '0';
            ans = Math.max(ans, ch[i]);
        }
        return ans;
    }
}
