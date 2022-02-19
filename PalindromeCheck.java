import java.util.*;

class PalindromeCheck {
  public static boolean isPalindrome(String str) {
		int startIdx = 0;
		int endIdx = str.length()-1;
		while(startIdx < endIdx){
			if(str.charAt(startIdx) == str.charAt(endIdx)){
				startIdx++;
				endIdx--;
			}else{
				return false;
			}
		}
    return true;
  }
}
