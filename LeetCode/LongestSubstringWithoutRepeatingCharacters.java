package LeetCode;

import java.util.HashSet;

// Given a string s, find the length of the longest substring without repeating characters.
// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


// --------------------------------SOLUTION-----------------------
class LengthOfLongestSubstring {
    public static void main(String[] args) {
        LengthOfLongestSubstring testCases = new LengthOfLongestSubstring();
        System.out.println(testCases.lengthOfLongestSubstring("abcabcbb"));//3
        System.out.println(testCases.lengthOfLongestSubstring("bbbbb"));//1
        System.out.println(testCases.lengthOfLongestSubstring("pwwkew")); //3
        System.out.println(testCases.lengthOfLongestSubstring("")); //0


    }
    public int lengthOfLongestSubstring(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        HashSet<Character> longestSubStr = new HashSet<Character>();
        while(b_pointer < s.length()){
            if(!longestSubStr.contains(s.charAt(b_pointer))){
                longestSubStr.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(longestSubStr.size(), max);
            }else{
                longestSubStr.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
        
    }
}

// Time complexity: O(n)
// Space complexity: O(n)