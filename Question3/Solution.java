package Question3;

class Solution {

    public static void main(String[] args) {
        new Solution().lengthOfLongestSubstring("pwwkew");
    }

    public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        String longestSubString = "";
        int maxLength = 0;
        for (char c : charArray) {
            if (longestSubString.contains(String.valueOf(c))) {
                if (longestSubString.length() > maxLength) {
                    maxLength = longestSubString.length();
                }
                longestSubString = longestSubString.substring(longestSubString.lastIndexOf(c) + 1) + c;
            } else {
                longestSubString += c;
            }

        }

        if (maxLength > longestSubString.length()) {
            return maxLength;
        } else {
            return longestSubString.length();
        }
    }
}
