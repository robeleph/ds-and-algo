class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(findTruth(low, mid, nums)){
                high = mid;
            }else{
                low = mid + 1; 
            }
        }
        return low;
    }
    public boolean findTruth(int low, int high, int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= low && nums[i] <= high){
                count++;
            }
        }
        return high - low + 1 < count;
    }
}
