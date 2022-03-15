class PalindromeNumber {
    public boolean isPalindrome(int x) {
        System.out.println(reverseNumber(x));
        if(x == reverseNumber(x)){
            return true;
        }
        return false;
    }
    public int reverseNumber(int x){
        int inverse = 0;
        int holder = 0;
        while(x > 0){
            holder = x % 10;
            inverse = (inverse * 10) + holder;
            x = x / 10;  
        }
        return inverse;
    }
}
