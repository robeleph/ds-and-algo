import java.util.*;
class ConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        boolean isContains = true;
        int consistentCount = 0;
        for(char c : allowed.toCharArray()){
            set.add(c);
        }
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                if(!set.contains(words[i].charAt(j))){
                    isContains = false;
                }
            }
            if(isContains){
                consistentCount++;
            }
            isContains = true;
        }
        return consistentCount;
    }
}
