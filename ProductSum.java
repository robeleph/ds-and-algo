import java.util.*;

class ProductSum {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
		return productSumHelper (array, 1);
	}
	public static int productSumHelper(List<Object> array, int depth) {
		int sum = 0;
		for (Object el : array){
			if(el instanceof ArrayList){
				@SuppressWarnings("unchecked")
				ArrayList<Object> ls = (ArrayList<Object>) el;
				sum += productSumHelper(ls, depth + 1);
			}else {
				sum += (int) el;
			}
		}
    return sum * depth;

	}
}
