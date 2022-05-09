class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int iT = 0, iS = 0;
        
        while (iT < t.length()) {
            if (s.charAt(iS) == t.charAt(iT)) {
                iS++;
                if (iS == s.length()) return true;
            }
            iT++;
        }
        return false;
    }
}
