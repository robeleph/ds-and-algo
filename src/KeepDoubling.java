import java.util.ArrayList;
public class KeepDoubling {
    public int findFinalValue(int[] nums, int original) {
        boolean isContains = true;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        while(isContains){
            if(!list.contains(original)){
                isContains = false;
            }else{
                original = original * 2;
            }
        }
        return original;
    }
}
