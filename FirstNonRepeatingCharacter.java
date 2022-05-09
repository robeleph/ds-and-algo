import java.util.*;

class FirstNonRepeatingCharacter {

  public int firstNonRepeatingCharacter(String string) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int idx = 0; idx < string.length(); idx++){
			char character = string.charAt(idx);
			map.put(character, map.getOrDefault(character, 0) + 1);
		}
		for(int idx = 0; idx < string.length(); idx++){
			char character = string.charAt(idx);
			if(map.get(character) == 1){
				return idx;
			}
		}
    return -1;
  }
}
