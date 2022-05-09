public class NumbersWithAbsoluteDifferenceK {
    public int countKDifference(int[] nums, int k) {
        int start = 0;
        int end = 1;
        int result = 0;
        while(end < nums.length){
            if(Math.abs(nums[start] - nums[end]) == k){
                result++;
            }
            if(end + 1 < nums.length){
                end++;
            }else{
                end = ++start + 1;
            }
        }
        return result;
    }
}
