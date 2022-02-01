import java.util.*;
public class FindThreeLargestNumbers {
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here..
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        int rep = 3;
        int[] result = new int[3];
        int idx = 2;
        for(int i : array){
            pQueue.add(-i);
        }
        while(rep > 0){
            result[idx] = -pQueue.remove();
            idx--;
            rep--;
        }
        return result;
    }
}
