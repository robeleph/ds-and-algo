/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 */
class Palindrome {
    public boolean isPalindrome(int x) {
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
