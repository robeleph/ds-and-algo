import java.util.ArrayList; // import the ArrayList class
public class DecompressEncodedList {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> compressedNum = new ArrayList<Integer>();
        for(int i = 1; i < nums.length; i += 2){
            int num = nums[i];
            int maxIteration = nums[i-1];
            for(int j = 0; j < maxIteration; j++){
                compressedNum.add(num);
            }
        }
        int[] result = new int[compressedNum.size()];
        for(int k = 0; k < compressedNum.size(); k++){
            result[k] = compressedNum.get(k);
        }
        return result;
    }
}
