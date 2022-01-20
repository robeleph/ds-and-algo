public class DoubleReversal {
    public boolean isSameAfterReversals(int num) {
        if(num == (reverseNumber(reverseNumber(num)))){
            return true;
        }
        return false;
    }
    public int reverseNumber(int num){
        int base = 0;
        int result = 0;
        while(num > 0){
            base = num % 10;
            num = num / 10;
            result += base;
            result *= 10;
        }
        return result / 10;
    }
}
