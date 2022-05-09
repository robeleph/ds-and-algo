import java.util.*;

class MoveElementToEnd {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    // Write your code here.
		int endIdx = array.size() - 1;
		int i = 0;
		while(i < endIdx){
			if(array.get(i) == toMove){
				if(array.get(endIdx) != array.get(i)){
					if(i < endIdx){
						int holder = array.get(i);
						array.set(i, array.get(endIdx));
						array.set(endIdx, holder);
						endIdx--;
						i++;
					}
				}else{
					endIdx--;
				}
			}else{
				i++;
			}
		}
    return array;
  }
}
