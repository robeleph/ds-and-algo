import java.util.*;

class ArrayOfProducts {
  public int[] arrayOfProducts(int[] array) {
    int[] solution = new int[array.length];
		
		int leftProduct = 1;
		int rightProduct = 1;
		
		for (int i = 0; i < array.length; i++) {
			solution[i] = leftProduct;
			leftProduct *= array[i];
		}
		
		for (int j = array.length - 1; j >= 0; j--) {
			solution[j] *= rightProduct;
			rightProduct *= array[j];
		}
		
    return solution;
  }
}
