import java.util.*;

class GenerateDocument {

  public boolean generateDocument(String characters, String document) {
    // Write your code here.
		HashMap<Character, Integer> charSet = new HashMap<Character, Integer>();
		HashMap<Character, Integer> docSet = new HashMap<Character, Integer>();
		
		
		for(int i = 0; i < characters.length(); i++){
			char c = characters.charAt(i);
			charSet.put(c, charSet.getOrDefault(c, 0) + 1);
		}
		
		for(int j = 0; j < document.length(); j++){
			char d = document.charAt(j);
			docSet.put(d, docSet.getOrDefault(d, 0) + 1);
		}
		
		for(char cha : docSet.keySet()){
			if(charSet.containsKey(cha) && docSet.get(cha) <= charSet.get(cha)){
				continue;
			}else{
				return false;
			}
		}
    return true;
  }
}
