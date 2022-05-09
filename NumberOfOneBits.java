public class NumberOfOneBits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 1; i < 33; i++){
            if(getBits(i,n) == true){
                count++;
            }
        }
        return count;
                
        
    }
    public boolean getBits(int i,int n){
        return (n & (1 << i)) != 0;
    }
}
