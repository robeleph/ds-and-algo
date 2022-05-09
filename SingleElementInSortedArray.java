class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {

        if (nums.length == 1) return nums[0];
        int start = 0, result = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == nums[mid + 1]) {
                if (((end + 1) - mid) % 2 == 0) {
                    end = mid - 1;
                    if (end == 0) return nums[0];
                } else {
                    start = mid;
                }
            } else if (nums[mid] == nums[mid - 1]) {
                if (((mid + 1) - start) % 2 == 0) {
                    start = mid + 1;
                    if (start == end) return nums[start];
                } else {
                    end = mid;
                }
            } else {
                result = nums[mid];
                break;
            }
        }
        return result;
    }
}
