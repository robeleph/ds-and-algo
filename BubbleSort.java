import java.util.*;

class BubbleSort {
  public static int[] bubbleSort(int[] array) {
		if(array.length == 0)
			return new int[] {};
		
    for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length; j++){
				if(i != j && array[i] < array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
    return array;
  }
}
