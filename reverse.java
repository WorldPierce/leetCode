// Reverse digits of an integer.

// Example1: x = 123, return 321
// Example2: x = -123, return -321

public class Solution {
    public int reverse(int x) {
        StringBuilder neg = new StringBuilder();
        try{
            if(x < 0) { 
            x = Math.abs(x);
            neg.append(Integer.toString(x));
            neg.append("-");
            
        }
        else {
            neg.append(Integer.toString(x));
            
        }
        
        return Integer.parseInt(neg.reverse().toString());
        }
        catch (Exception e) {
            return 0;
        }
        
    }
}