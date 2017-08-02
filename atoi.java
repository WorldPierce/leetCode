// Implement atoi to convert a string to an integer.

public class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if(str.length() == 0) return 0;
        char[] c = str.toCharArray();
        int i = 0, num = 0, sign = c[i] == '-' ? -1 : 1;
        i = c[i] == '-' || c[i] == '+' ? i + 1 : i;
        //set bound at max/10
        int bound = Integer.MAX_VALUE/10;
        while(i < c.length && c[i] >= '0' && c[i] <= '9') {
            //subtracting char by '0' gives you int value since we know its between '0' and '9'
            
            //check if greater then bound with the lowest digit being < 7
            if(num > bound || (num == bound && c[i] - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }    
            num = (num * 10) + (c[i] - '0');
            i++;
        }
        return num * sign;
    }
}