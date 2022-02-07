import java.util.*;

class SelectionSort {
  public static int[] selectionSort(int[] array) {
    for(int i = 0; i < array.length - 1; i++){
			int currentIdx = i;
			for(int j = i + 1; j < array.length; j++){
				if(array[j] < array[currentIdx]){
					currentIdx = j;
				}
			}
			int temp = array[currentIdx];
			array[currentIdx] = array[i];
			array[i] = temp; 
		}
    return array;
  }
}
