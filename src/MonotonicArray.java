import java.util.*;

class MonotonicArray {
  public static boolean isMonotonic(int[] array) {
    // Write your code here.
		if(array.length <= 2) return true;
		int direction = array[1] - array[0];
		
		for(int i = 2; i < array.length; i++){
			if(direction == 0){
				direction = array[i] - array[i-1];
				continue;
			}
			if(breaksDirection(direction, array[i-1], array[i])){
				return false;
			}
		}
		return true;
	}
	public static boolean breaksDirection(int direction, int previous, int current){
		int difference = current - previous;
		if((direction > 0 && difference < 0) || (direction < 0 && difference > 0)){
			return true;
		}else{
			return false;
		}
	}
}
