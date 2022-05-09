class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }else{
                i++;
            }
        }
        for(int k = 0; k < nums.length; k++){
            if(nums[k] != k+1){
                return k+1;
            }
        }
        return nums.length + 1;
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
