import java.util.*;

class TandemBicycle {

  public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fast) {
    Arrays.sort(redShirtSpeeds);
		Arrays.sort(blueShirtSpeeds);
		boolean fastest = fast;
		int start = 0;
		int end = redShirtSpeeds.length - 1;
		int totalSpeed = 0;
		while(start < redShirtSpeeds.length){
			if(fastest){
				totalSpeed += Math.max(redShirtSpeeds[end], blueShirtSpeeds[start]);				
			}else{
				totalSpeed += Math.max(redShirtSpeeds[start], blueShirtSpeeds[start]);				
			}
			start++;
			end--;
		}
		return totalSpeed;
  }
}
