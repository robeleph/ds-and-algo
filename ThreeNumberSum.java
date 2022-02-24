import java.util.*;

class ThreeNumberSum {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
		List<Integer[]> solution = new ArrayList<Integer[]>();
		for (int i = 0; i < array.length - 2; i++){
			int leftIdx = i + 1;
			int rightIdx = array.length - 1;
			while (leftIdx < rightIdx) {
				int currentSum = array[i] + array[leftIdx] + array[rightIdx];
				if (currentSum == targetSum) {
					Integer[] temp = {array[i], array[leftIdx], array[rightIdx]};
					solution.add(temp);
					leftIdx++;
					rightIdx--;
				}else if (currentSum < targetSum) {
					leftIdx++;
				}else {
					rightIdx--;
				}
			}
		}
    return solution;
  }
}
