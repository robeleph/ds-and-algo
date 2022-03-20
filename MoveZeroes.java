class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[j++]=nums[i];
            }
        }
        for(int k=j;k<n;k++)
        {
            nums[k]=0;
        }
    }
}
