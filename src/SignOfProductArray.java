public class SignOfProductArray {
        public int arraySign(int[] nums) {
            int pro = 1;
            for(int i=0; i < nums.length; i++){
                pro *= nums[i];
                if(pro < 0)
                    pro =-1;
                else if(pro > 0)
                    pro = 1;
            }
            return pro;
        }
}
