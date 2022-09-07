class ClimbingStairs {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if (map.containsKey(n)) return map.get(n);
        if (n == 1) return 1;
        if (n == 2) return 2;
        int result = climbStairs(n-1) + climbStairs(n-2);
        map.put(n, result);
        return result;  
    }
}
