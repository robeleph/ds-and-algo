class ConcatenationOfAnArray {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int i = 0;
        int k = 0;
        int n = 0;
        while(n < 2){
            result[i] = nums[k];
            i++;
            k++;
            if(k == nums.length){
                n++;
                k = 0;
            }
        }
        return result;
    }
}