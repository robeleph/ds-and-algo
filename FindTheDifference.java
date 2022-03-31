class FindTheDifference {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : map.keySet()){
            if(map.get(c) % 2 != 0) return c;
        }
        return 'a';
    }
}
