import java.util.*;

class CaesarCipherEncryptor {
  public static String caesarCypherEncryptor(String str, int key) {
		String result  = "";
		for(int i = 0; i < str.length(); i++){
			int idx = str.charAt(i) + key;
			if(idx > 122){
				idx = 96 + ((idx - 122) % 26); 
				result += (char) (idx);
			}else{
				result += (char) idx;
			}
		}
    return result;
  }
}
