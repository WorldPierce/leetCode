// Given a string, find the length of the longest substring without repeating characters.

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int highCount = 1;
        String temp = "";
        sb.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(sb.indexOf(Character.toString(s.charAt(i))) == -1){
                sb.append(s.charAt(i));
                count = sb.length();
            }
            else {
                sb.append(s.charAt(i));
                temp = sb.substring(sb.indexOf(Character.toString(s.charAt(i))) + 1);
                sb.setLength(0);
                sb.append(temp);
                count = sb.length();
            }
            if(count > highCount) {
                highCount = count;
            }
        }
        return highCount;
    }
}