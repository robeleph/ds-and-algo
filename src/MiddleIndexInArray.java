public class MiddleIndexInArray {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for(int i : nums)
            sum += i;
        for(int j = 0; j < nums.length; j++){
            if(leftSum == sum-leftSum-nums[j])
                return j;
            leftSum += nums[j];
        }
        return -1;
    }
}
