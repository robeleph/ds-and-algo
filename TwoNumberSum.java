import java.util.*;

class TwoNumberSum {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		HashSet<Integer> set = new HashSet<>();
		int[] result = new int[2];
		for(int i : array){
			set.add(i);
		}
		for(int i = 0; i < array.length; i++){
			int currentNum = array[i];
			int findNum = targetSum - currentNum;
			if(set.contains(findNum) && currentNum != findNum){
				result[0] = currentNum;
				result[1] = targetSum - currentNum;
				return result;
			}
		}
    return new int[0];
  }
}
