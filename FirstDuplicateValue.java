import java.util.*;

class FirstDuplicateValue {

  public int firstDuplicateValue(int[] array) {
    // Write your code here.
		HashSet<Integer> set = new HashSet<>();
		for(int i : array){
			if(!set.add(i))
				return i;
			set.add(i);
		}
    return -1;
  }
}
