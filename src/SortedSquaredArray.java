import java.util.*;
public class SortedSquaredArray {
    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] result = new int[array.length];
        for(int i = 0; i < array.length; i++){
            result[i] = array[i] * array[i];
        }
        Arrays.sort(result);
        return result;
    }
}
