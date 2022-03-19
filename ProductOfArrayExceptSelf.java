class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int temp=1;
        int[] prod=new int[nums.length];
        for(int i=0;i<prod.length;i++)
        {
            prod[i]=temp;
            temp*=nums[i];
        }   
        temp=1;
        for(int i=prod.length-1;i>=0;i--){
            prod[i]*=temp;
            temp*=nums[i];
        }
        return prod;
    }
}
