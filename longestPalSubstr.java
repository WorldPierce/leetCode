// Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

public class Solution {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int len = s.length();
        while(len >= 0) {
            for(int i = 0; i + len - 1 < chars.length; i++) {
                int left = i;
                int right = i + len - 1;
                boolean pal = true;
                while(left < right) {
                    if(chars[left] != chars[right]) {
                        pal = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if(pal) {
                    return s.substring(i,i+len);
                }
                
            }
            len--;
        }
        return "";
    }
}