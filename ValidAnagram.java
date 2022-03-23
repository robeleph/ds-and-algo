class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char c : s.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for(char d : t.toCharArray()){
            map2.put(d, map2.getOrDefault(d, 0) + 1);
        }
        if(map1.equals(map2)){
            return true;
        }
        return false;
    }
}
