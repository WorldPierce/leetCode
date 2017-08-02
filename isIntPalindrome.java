// Determine whether an integer is a palindrome. Do this without extra space.
public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 10) return true;
        int high = 0, low = 1, temp = x;
        while(temp >= 10) {
            temp = temp / 10;
            high++;
        }
        while(high >= low) {
            //get highest value
            int highVal = (int)(x / Math.pow(10,high)) % 10;
            //get lowest value, remove lowest digit
            int lowVal = x % 10;
            x = x / 10;
            if(highVal != lowVal) return false;
            //must decriment high by 2 since we decrease int size by 1 digit.
            high -= 2; 
            
        }
        return true;
    }
}