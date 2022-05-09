class LongestNonRepeatingSubSequence {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int maxLength = 0;
        int currentLength = 0;
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(windowStart));
                windowStart++;
            }
            set.add(s.charAt(i));
            currentLength = (i - windowStart) + 1;
            maxLength = Math.max(maxLength, currentLength);            
        }
        
        return maxLength;
    }
}
