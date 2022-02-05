import java.util.*;

class ReverseWordsInStrings {

  public String reverseWordsInString(String string) {
    ArrayList<String> list = new ArrayList<String>();
		String holder = "";
		String result = "";
		for(int i = 0; i < string.length(); i++){
			char c = string.charAt(i);
			if(c != ' '){
				holder += c;
			}else{
				list.add(holder);
				holder = "";
			}
		}
		list.add(holder);
		Collections.reverse(list);
    return String.join(" ", list);
  }
}
